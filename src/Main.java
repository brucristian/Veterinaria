import models.*;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Propietario dueno = new Propietario("Cristian Bru", "12132334", "Piedra bolivar 49b", "+573006654438");

        Mascota m1 = new Mascota("Canino", "Macho", "Marrón", "Thor", "Golden", new Date(), "985121", 3, "Mancha", dueno);
        Mascota m2 = new Mascota("Canino", "Macho", "Dorado y gris", "Tommy", "Yorshire", new Date(), "777888", 2, "Medio dorado y medio gris", dueno);


        dueno.getMisMascotas().add(m1);
        dueno.getMisMascotas().add(m2);


        Veterinario vet = new Veterinario("Dr. Ricardo Sierra", "Cardiología");


        ArrayList<Medicamento> listaMed = new ArrayList<>();
        listaMed.add(new Medicamento("Omeprazol", "2 cada 8 horas"));
        listaMed.add(new Medicamento("Vitaminas", "5ml diario"));

        Consulta cita = new Consulta("C-101", "Chequeo Corazón", "29/03/2026", listaMed, vet);


        System.out.println("=== REPORTE VETERINARIA ===");
        System.out.println("PROPIETARIO: " + dueno.getNameCompleto());
        System.out.println("MASCOTAS:");


        for (Mascota m : dueno.getMisMascotas()) {
            System.out.println(" - " + m.getNameCompleto() + " (" + m.getRaza() + ")");
        }

        System.out.println("\n--- DETALLE DE CONSULTA ---");
        System.out.println("Paciente: " + m1.getNameCompleto());
        System.out.println("Motivo: " + cita.getMotivo());
        System.out.println("Atendido por: " + cita.getMedicoResponsable().getNombre());

        System.out.println("Medicamentos Recetados:");
        for (Medicamento med : cita.getMedicamentos()) {
            System.out.println(" > " + med.getNombre() + " (" + med.getDosis() + ")");
        }
    }
}