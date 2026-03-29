package models;

import java.util.Date;

public class Mascota extends Animal {
    private String nameCompleto;
    private String raza;
    private Date fechaNacimiento;
    private String microChip;
    private int edad;
    private String rasgosParticulares;
    private Propietario propietario;



    public Mascota(String especie, String genero, String color, String nameCompleto,
                   String raza, Date fechaNacimiento, String microChip, int edad,
                   String rasgosParticulares, Propietario propietario) {
        super(especie, genero, color);
        this.nameCompleto = nameCompleto;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.microChip = microChip;
        this.edad = edad;
        this.rasgosParticulares = rasgosParticulares;
        this.propietario = propietario;
    }

    public Mascota() {
    }

    public String getNameCompleto() {
        return nameCompleto;
    }

    public void setNameCompleto(String nameCompleto) {
        this.nameCompleto = nameCompleto;
    }

    public String getRaza() {
        return raza;
    }


    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getMicroChip() {
        return microChip;
    }

    public void setMicroChip(String microChip) {
        this.microChip = microChip;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRasgosParticulares() {
        return rasgosParticulares;
    }

    public void setRasgosParticulares(String rasgosParticulares) {
        this.rasgosParticulares = rasgosParticulares;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
