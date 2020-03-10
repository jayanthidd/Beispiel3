package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int alter;
        alter = 15;
        //hier wird der code immer ausgefuert
        if (alter >= 18){
            //hier nur rein wenn mindestens 18 jahre alt
            System.out.println("Auch Schnapps erlaubt :)");
        } else if (alter>=16) {
            System.out.println("Ich darf hinein aber nur mit Wein^^");
        }
        else {
            //hier gehen wir rein wenn wir junger als 18 sind
            System.out.println("Gehe zwichenzeitlich Pizza essen");
        }
        //hier wird der code immer ausgefuert
        System.out.println("Warte gelangweilt im Auto");
        // Beispiel fuer einen Switch
        int note = 2, stipendium;
        // Berechne Förderstipendium
        switch (note){
            case 1:
                //hier steht der code der ausgefuert wird wenn ich 1 bekomme
                stipendium = 100;
                break;
            case 2:
                stipendium = 50;
                break;
            case 3:
                stipendium = 30;
                break;
            default:
                stipendium = 10;
                break;
        }
        System.out.println("Stipendium: "+stipendium + "€");
    }

}
