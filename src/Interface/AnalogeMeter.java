package Interface;

import Domein.Snelheid;
import Service.Observer;
import Service.Subject;

public class AnalogeMeter implements Observer {
    private Subject s;

    public AnalogeMeter(Subject S) {
        s = S;
        s.attach(this);
    }

    @Override
    public void update(Subject S) {
        System.out.println("AM: Snelheid : " + String.valueOf(((Snelheid)S).getWaarde()));
    }

}
