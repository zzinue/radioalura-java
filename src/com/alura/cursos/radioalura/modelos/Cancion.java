package com.alura.cursos.radioalura.modelos;

public class Cancion extends Audio {
    private String Album;
    private String cantante;
    private  String genero;

    @Override
    public int getClasificacion() {
        if(getTotalDeMeGusta()>2000){
            return 9;
        }else {
            return 2;
        }
    }

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
