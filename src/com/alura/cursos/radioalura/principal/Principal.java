package com.alura.cursos.radioalura.principal;

import com.alura.cursos.radioalura.modelos.Cancion;
import com.alura.cursos.radioalura.modelos.Podcast;

public class Principal {
    public  static void main (String[] args){
        Cancion miCancion=new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast=new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar");
        miPodcast.setTitulo("Cafe.Tech");


        for (int i = 0; i <100 ; i++) {
            miCancion.meGusta();
            
        }
        for (int i = 0; i <5000 ; i++) {
            miCancion.reproduce();

        }

        System.out.println("Total de reproduciones:"+ miCancion.getTotalDeReproduciones());
        System.out.println("Total de me gusta:"+ miCancion.getTotalDeMeGusta());
    }
}
