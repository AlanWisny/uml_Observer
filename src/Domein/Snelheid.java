package Domein;

import Service.Subject;

public class Snelheid extends Subject {
    private int waarde;

    public Snelheid() {
        waarde = 0;
    }

    public void setWaarde(int i) {
        waarde = i;
        notifyObs();
    }

    public int getWaarde() {
        return waarde;
    }

    public int sensor() {
        return 100;
    }

    public void meet() {
        waarde = sensor();
        notifyObs();
    }
}
