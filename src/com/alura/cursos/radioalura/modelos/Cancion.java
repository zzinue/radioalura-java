package com.alura.cursos.radioalura.modelos;

public class Cancion extends Audio {
    private String Album;
    private String cantante;
    private  String genero;


    public String getCantante() {
        return cantante;
    }

    public String getAlbum() {
        return Album;
    }

    public String getGenero() {
        return genero;
    }


    public void setAlbum(String album) {
        Album = album;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }
}
