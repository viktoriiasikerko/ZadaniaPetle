package com.zadaniazobiektowosci;

public class Main {

    public static void main(String[] args) {

        Samochod honda = new Samochod();
        honda.nazwa = "Honda";
        honda.predkosc = 250;
        honda.kolor = "Czarny";
        honda.wypiszInformacjeOSamochodzie();
        honda.przyspieszO5Km();
        honda.zwolnijO10Km();
    }
}