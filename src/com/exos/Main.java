package com.exos;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        int saisiNb;
        int i;
        int random;
        int min = 1;
        int max = 100;
        int nbAleatoire = (int) (Math.random() * (max - min));
        System.out.println("Choisir un nombre entre 1 et 100:");
        Scanner lectureClavier = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            saisiNb = lectureClavier.nextInt();
            if (saisiNb == nbAleatoire) {
                System.out.println("le nombre mystere est: " + saisiNb);
            } else {
                System.out.println("ce n'est pas le bon");
            }
            System.out.println("Nombre aléatoire " + nbAleatoire);
        }
    }
}
