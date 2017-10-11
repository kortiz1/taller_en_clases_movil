package com.example.android.taller2;

/**
 * Created by Android on 26/09/2017.
 */

public class Celular {

    private String marca;
    private String color;
    private String rams;
    private String sistemas;

    public Celular(String marca, String color, String rams, String sistemas) {
        this.marca = marca;
        this.color = color;
        this.rams = rams;
        this.sistemas = sistemas;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getRams() {
        return rams;
    }

    public String getSistemas() {
        return sistemas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRams(String rams) {
        this.rams = rams;
    }

    public void setSistemas(String sistemas) {
        this.sistemas = sistemas;
    }
}
