package com.company;

import Domein.Snelheid;
import Interface.AnalogeMeter;
import Interface.DigitaleMeter;

public class Main {

    public static void main(String[] args) {
        Snelheid S = new Snelheid();
        DigitaleMeter dm = new DigitaleMeter(S);
        AnalogeMeter am = new AnalogeMeter(S);


        S.setWaarde(666);
        S.meet();
    }
}
