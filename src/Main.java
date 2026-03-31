import models.Mascota;
import models.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static ArrayList<Propietario> bdPropietarios = new ArrayList<>();
    static ArrayList<Mascota> bdMascotas = new ArrayList<>();
    static ArrayList<Consulta> bdConsultas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        generarDatosPrueba();

        Veterinario vet = new Veterinario("Dr. Ricardo Sierra", "Cardiología");

        Consulta cita = new Consulta("C-101", "Chequeo Corazón", "30/03/2026", new ArrayList<>(), vet);

        vet.recetar(cita,new Medicamento("Omeprazol", "2 cada 8 horas"));
        vet.recetar(cita,new Medicamento("Vitaminas", "5ml diario"));

        bdConsultas.add(cita);

        int opcion = 0;
        do {
            System.out.println("\n=== SISTEMA VETERINARIO ===");
            System.out.println("1. Ver todas las mascotas");
            System.out.println("2. Ver propietarios con sus mascotas");
            System.out.println("3. Ver todas las consultas");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n--- LISTA DE TODAS LAS MASCOTAS ---");
                    for (Mascota m : bdMascotas) {
                        System.out.println("- " + m.getNameCompleto() + " | Raza: " + m.getRaza() + " | Dueño: " + m.getPropietario().getNameCompleto());
                    }
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE PROPIETARIOS Y SUS MASCOTAS ---");
                    for (Propietario p : bdPropietarios) {
                        System.out.println("Propietario: " + p.getNameCompleto() + " (Tel: " + p.getTelefono() + ")");
                        if (p.getMisMascotas() == null || p.getMisMascotas().isEmpty()) {
                            System.out.println("   No tiene mascotas registradas.");
                        } else {
                            for (Mascota m : p.getMisMascotas()) {
                                System.out.println("   -> Mascota: " + m.getNameCompleto() + " (" + m.getRaza() + ")");
                            }
                        }
                        System.out.println("--------------------------------------------------");
                    }
                    break;

                case 3:
                    System.out.println("\n--- HISTORIAL DE CONSULTAS ---");
                    for (Consulta c : bdConsultas) {
                        System.out.println("Código: " + c.getIdConsulta() + " | Motivo: " + c.getMotivo());
                        System.out.println("Atendido por: " + c.getMedicoResponsable().getNombre());
                        System.out.println("Medicamentos Recetados:");
                        if (c.getMedicamentos() == null || c.getMedicamentos().isEmpty()) {
                            System.out.println("   - Ningún medicamento recetado.");
                        } else {
                            for (Medicamento med : c.getMedicamentos()) {
                                System.out.println("   > " + med.getNombre() + " (" + med.getDosis() + ")");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    public static void generarDatosPrueba() {
        String[] nombresDuenos = {"Cristian Bru", "Ana Lopez", "Carlos Ruiz", "Maria Gomez", "Jorge Perez"};
        String[] telefonos = {"+573006654438", "+57311223344", "+57315555666", "+57320999888", "+57300111222"};
        String[] identificaciones = {"12132334", "10203040", "50607080", "90102030", "40506070"};
        String[] direcciones = {"Piedra bolivar 49b", "Calle 12 #4-5", "Cra 50 #12-3", "Av Principal 1", "Barrio Sur 99"};

        for (int i = 0; i < nombresDuenos.length; i++) {
            Propietario p = new Propietario(nombresDuenos[i], identificaciones[i], direcciones[i], telefonos[i]);
            bdPropietarios.add(p);
        }

        String[] nombresMascotas = {"Thor", "Tommy", "Luna", "Rex", "Milo", "Kira", "Max", "Bella"};
        String[] razas = {"Golden", "Yorkshire", "Pug", "Pastor Alemán", "Beagle", "Husky", "Labrador", "Poodle"};

        for (int i = 0; i < nombresMascotas.length; i++) {
            Propietario duenoAsignado = bdPropietarios.get(i % bdPropietarios.size());

            Mascota m = new Mascota("Canino", "Vario", "Vario", nombresMascotas[i], razas[i], new Date(), "CHIP-" + i, (i % 5) + 1, "Ninguna", duenoAsignado);

            bdMascotas.add(m);
            duenoAsignado.getMisMascotas().add(m);
        }
    }
}