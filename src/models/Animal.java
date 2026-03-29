package models;

public class Animal {
     private String especie;
     private  String genero;
     private  String color;

    public Animal() {
    }

    public Animal(String especie, String genero, String color) {
        this.especie = especie;
        this.genero = genero;
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
