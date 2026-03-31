package models;

public class Veterinario {
    private String nombre;
    private String especialidad;

    public Veterinario() {
    }

    public Veterinario(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void recetar(Consulta consulta, Medicamento medicamento) {
        consulta.getMedicamentos().add(medicamento);
        System.out.println("¡Medicamento '" + medicamento.getNombre() + "' recetado con éxito!");
    }


}
