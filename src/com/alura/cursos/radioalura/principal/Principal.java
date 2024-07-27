package com.alura.cursos.radioalura.principal;

import com.alura.cursos.radioalura.modelos.Cancion;
import com.alura.cursos.radioalura.modelos.MisFavoritos;
import com.alura.cursos.radioalura.modelos.Podcast;

public class Principal {
    public  static void main (String[] args){
        Cancion miCancion=new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast=new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar");
        miPodcast.setTitulo("Cafe.Tech");

//cancion--------------------------------
        for (int i = 0; i <100 ; i++) {
            miCancion.meGusta();
            
        }
        for (int i = 0; i <2000 ; i++) {
            miCancion.reproduce();

        }
//podcasta  -----------------------
        for (int i = 0; i <100 ; i++) {
            miPodcast.meGusta();

        }
        for (int i = 0; i <8000 ; i++) {
            miPodcast.reproduce();

        }

        System.out.println("Total de reproduciones:"+ miCancion.getTotalDeReproduciones());
        System.out.println("Total de me gusta:"+ miCancion.getTotalDeMeGusta());



        MisFavoritos favoritos=new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);
    }
}
