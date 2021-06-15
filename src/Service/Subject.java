package Service;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> myObs = new ArrayList<Observer>();

    public void attach(Observer o){
        myObs.add(o);
    }

    public void detach(Observer o) {
        myObs.remove(o);
    }

    public void notifyObs() {
        for (Observer o : myObs) {
            o.update(this);
        }
    }



}
