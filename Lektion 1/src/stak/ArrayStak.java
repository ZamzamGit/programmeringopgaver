package stak;

import java.util.ArrayList;
import java.util.List;

public class ArrayStak implements Stak {

    private List<String> stak = new ArrayList<>();

    @Override
    public void push(String e) {
        stak.add(e);
    }

    @Override
    public String pop(String e) {
        String firstElement;

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void show() {

    }
}
