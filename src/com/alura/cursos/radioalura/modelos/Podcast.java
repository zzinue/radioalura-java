package com.alura.cursos.radioalura.modelos;

public class Podcast extends  Audio{
    private String presentador;
    private String descripcion;

    public String getPresentador() {
        return presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
