package com.politecnicomalaga.appindustriaendes;

public class Maquina {
    //Atributos
    //visibilidad tipo nombre;

    private String codMaquina;
    private float amperios;
    private float temperatura;
    private boolean encendida;

    public enum Piloto {
        rojo,
        verde,
        amarillo,
        off
    }



    //Métodos

    public Maquina(String codMaquina, float amperios, float temperatura, boolean encendida) {
        this.codMaquina = codMaquina;
        this.amperios = amperios;
        this.temperatura = temperatura;
        this.encendida = encendida;
    }

    public String getCodMaquina() {
        return codMaquina;
    }

    public void setCodMaquina(String codMaquina) {
        this.codMaquina = codMaquina;
    }

    public float getAmperios() {
        return amperios;
    }

    public void setAmperios(float amperios) {
        this.amperios = amperios;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }


    //visibilidad tiporetorno nombre(Tipo arg1, Tipo arg2...) {

    public boolean arrancar() {
        return false;
    }

    public boolean comprobarTemperatura() {
        return true;
    }

    public boolean comprobarAmperaje() {
        return true;
    }

    public boolean apagar() {
        return true;
    }

    public boolean detecterIncidencia() {
        return true;
    }
}
