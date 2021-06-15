package Interface;

import Domein.Snelheid;
import Service.Observer;
import Service.Subject;

public class DigitaleMeter implements Observer {
    private Subject s;

    public DigitaleMeter(Snelheid S) {
        s = S;
        s.attach(this);
    }

    @Override
    public void update(Subject S) {
        System.out.println("DM: Snelheid : " + String.valueOf(((Snelheid)S).getWaarde()));
    }
}
