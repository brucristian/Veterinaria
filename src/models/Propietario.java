package models;

import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private String nameCompleto;
    private String id;
    private String direccion;
    private String telefono;
    private List<Mascota> misMascotas = new ArrayList<>();

    public Propietario() {
    }

    public Propietario(String nameCompleto, String id, String direccion, String telefono) {
        this.nameCompleto = nameCompleto;
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNameCompleto() {
        return nameCompleto;
    }

    public void setNameCompleto(String nameCompleto) {
        this.nameCompleto = nameCompleto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Mascota> getMisMascotas() {
        return misMascotas;
    }

    public void setMisMascotas(List<Mascota> misMascotas) {
        this.misMascotas = misMascotas;
    }
}

