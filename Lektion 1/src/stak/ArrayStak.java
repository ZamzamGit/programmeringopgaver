package stak;

import javax.security.auth.login.CredentialNotFoundException;
import java.beans.Customizer;
import java.util.ArrayList;
import java.util.List;

public class ArrayStak implements Stak {

    private String stak[] = new String[4];
    private int a = 0;


    @Override
    public void push(String e) {
        if (a < 4) {
            stak[a++] = e;
        } else {
            System.out.println("Kan ikke tilføjet mere");

        }
    }

    @Override
    public String pop() {
        String firstNumber;
        firstNumber = stak[0];

        for (int i = 0; i < stak.length; i++) {
            if (i < stak.length - 1) {
                stak[i] = stak[i + 1];
                stak[i + 1] = null;
            }
        }
        return firstNumber;
    }

    @Override
    public boolean isEmpty() {
        int howManyStrings = 4;
        for (int i = 0; i < stak.length; i++) {
            if (stak[i] == null) {
                howManyStrings -= 1;
            }
            if (howManyStrings == 0) {
                System.out.println("Den er tom");
                return true;
            }
        }
        System.out.println("Ikke tom");
        return false;
    }

    @Override
    public boolean isFull() {

        int howManyStrings = 0;
        for (int i = 0; i < stak.length; i++) {
            if (stak[i] == null) {
                howManyStrings += 1;
            }
            if (howManyStrings == 4) {
                System.out.println("Den er fuld");
                return true;
            }
        }
        System.out.println("Ikke fuldt endnu");
        return false;
    }

    @Override
    public void show() {
        for (int i = 0; i < stak.length; i++) {
            if (stak[i] != null) {
                System.out.println(stak[i]);
            }
        }
    }
}


