import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
    //Recomendacion leer esto mentalmente con la voz de sigan viendo
    //me un aeropuerto casi dañado adivinen que vamo a hacer con el sigan viendo
public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        // Creamos el aeropuerto SIGAN VIENDO
        Aeropuerto aeropuerto = new Aeropuerto("Aeropuerto Internacional de cunco", "Cunco");

        // creamo el avion SIGAN VIENDO
        Avion avion = new Avion(1, 180); // ID: 1, capacidad: 180
        aeropuerto.agregarAvion(avion);

        // Creamos un vuelo SIGAN VIENDO
        SimpleDateFormat sdf = new SimpleDateFormat("dia/mes/año");
        Date fechaVuelo = null;
        try {
            System.out.println("Ingrese la fecha del vuelo (dia/mes/año): ");
            String fechaString = scanner.nextLine();
            fechaVuelo = sdf.parse(fechaString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Vuelo vuelo = new Vuelo("V1234", "Cunco poh peñi", "Hamaica mi chamo", fechaVuelo);
        avion.agregarVuelo(vuelo);

        // Registlamoh los pasajeros SIGAN VIENDO
        Pasaporte pasaporte1 = new Pasaporte(1, "Peruano :(", 10, sdf.parse("10/10/2025"));
        Pasajeros pasajero1 = new Pasajeros("Samuel quispe", 50, pasaporte1);
        vuelo.agregarPasajero(pasajero1);

        Pasaporte pasaporte2 = new Pasaporte(2, "Hamaiquina", 0, sdf.parse("10/10/2023"));
        Pasajeros pasajero2 = new Pasajeros("María García", 25, pasaporte2);
        vuelo.agregarPasajero(pasajero2);

        //Registramos los pilotos  SIGAN VIENDO
        Pasaporte pasaportePiloto = new Pasaporte(3, "Chileno", 5, sdf.parse("10/10/2024"));
        Piloto piloto = new Piloto(" Mi Amigo Alexis", 45, pasaportePiloto, "LIC3312", "V1234");
        vuelo.agregarPiloto(piloto);

        // Validamos los pasaportes SIGAN VIENDO
        System.out.println("Ahora validamo los pasaportes...");
        for (Pasajeros pasajero : vuelo.getPasajeros()) {
            System.out.println("Validando pasaporte de " + pasajero.getNombre());
            Pasaporte pasaporte = pasajero.getPasaporte();
            if (pasaporte.getFechaExpiracion().before(new Date())) {
                System.out.println("El pasaporte de " + pasajero.getNombre() + " está expirado.");
            } else if (pasaporte.getNum_hojas() <= 0) {
                System.out.println("El pasaporte de " + pasajero.getNombre() + " no tiene hojas libres.");
            } else {
                System.out.println("El pasaporte de " + pasajero.getNombre() + " es válido.");
            }
        }

        //  Buscamos los pasajeros por fecha SSSIGAN VIENDO
        System.out.println("\nBuscar usuarios por fecha:");
        aeropuerto.agruparPorFecha(vuelo); // Método implementado en Aeropuerto

        // Buscamos los pasajeros de un vuelo en especifico SSSIGAN VIENDO
        System.out.println("\nUsuarios del vuelo " + vuelo.getId() + ":");
        vuelo.registrarWeones(); // Método implementado en Vuelo
    }
    // Y miren nomas que lindo mi gente como quedaron las funcionalidades del aeropuerto, siganme los que no me siguen sssigan viendo
}
