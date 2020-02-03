package stak;

import java.beans.Customizer;
import java.util.ArrayList;
import java.util.List;

public class ArrayStak implements Stak {

    private List<String> stak = new ArrayList<>();

    @Override
    public void push(String e) {
        if(stak.size() > 4) {
            System.out.println("Der kan ikke tilføjes mere");
        } else {
            stak.add(e);
        }
    }

    @Override
    public String pop(String e) {
        stak.remove(e);
        return e;
    }

    @Override
    public boolean isEmpty() {

        if(stak.size() > 0) {
            System.out.println("Ikke tom");
            return true;
        } else {
            System.out.println("Tom");
            return false;
        }


    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void show() {
        for (int i = 0; i < stak.size() ; i++) {

            String s = this.stak.get(i);

            System.out.println(s);
        }
    }
}
