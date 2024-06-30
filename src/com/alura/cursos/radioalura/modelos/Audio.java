package com.alura.cursos.radioalura.modelos;

public class Audio {
    private String titulo;
    private  int totalDeReproduciones;
    private int totalDeMeGusta;
    private  int clasificacion;

    public void  meGusta(){
        this.totalDeMeGusta++;

    }
    public  void  reproduce(){
        this.totalDeReproduciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public int getTotalDeReproduciones() {
        return totalDeReproduciones;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTotalDeReproduciones(int totalDeReproduciones) {
        this.totalDeReproduciones = totalDeReproduciones;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
