package com.company;

public class Tierheim {
    public static void main (String[] args){
        System.out.println("Wilkommen im glücklichen Tierheim");
        // Hund Lassie - 20 kg - spielfreudig, löst Kriminalfälle
        double futterLessie;
        double gewicht;
        gewicht = 20;

        futterLessie = berechneFuettermenge(gewicht);
        System.out.println("Lessie bekommt " + futterLessie + " kg Futter");
        System.out.println("-----------------------------");

        ++gewicht;
        // fuettern am Abend
        futterLessie = berechneFuettermenge(gewicht);
        System.out.println("Lessie bekommt am Abend " + futterLessie + " kg Futter");
        System.out.println("-----------------------------");

        //walking distance for dogs
        System.out.println("This dog can walk "+wieWeitSpazieren(2, 23, true)+"Km");
        System.out.println("-----------------------------");

        //cuddle for dogs. Consider the order important
        int[] cuddletime = new int[] {5,25,30};
        boolean cuddle = kuschelBedarf(cuddletime);
        if (cuddle == false)
            System.out.println("Should the dog be cuddled?: Nein!");
        else
            System.out.println("Should the dog be cuddled?: Yessss!");
        System.out.println("-----------------------------");
    }

    public static boolean kuschelBedarf(int[] cuddleunits){
        int first =cuddleunits[0];
        int second =cuddleunits[1];
        int third = cuddleunits[2];
        boolean cuddle = true;
        if (first+second+third>=60)
            cuddle = false;
        else if (first<second && second<third)
            cuddle = true;
        if (second >=25)
            cuddle = false;
        return cuddle;
    }

    public static double wieWeitSpazieren (double gewicht, double letzesMal, boolean vertraegtSich){
        double spazieren = 5;
        if (gewicht<=1) {
            if (vertraegtSich == true)
                spazieren = 4;
            else
                spazieren = 2;
        }
        else if ((gewicht>15 || letzesMal>24) && vertraegtSich == true)
                spazieren=8;
        return spazieren;
    }

    public static double berechneFuettermenge(double gewicht){
        double futterMenge;

        futterMenge = gewicht / 20;

        return futterMenge;
        // ganz kurz geschrieben
        // return gewicht / 20
    }

}