package stak;

import javax.security.auth.login.CredentialNotFoundException;
import java.beans.Customizer;
import java.util.ArrayList;
import java.util.List;

public class ArrayStak implements Stak {

    private String stak[] = new String[4];
    int a=0;

    @Override
    public void push(String e) {
        stak[a++] = e;

        }




    @Override
    public String pop() {
        String firstNumber;
        firstNumber = stak[0];

        for (int i = 0; i < stak.length; i++) {
           if (i < 3) {
               stak[i] = stak[i + 1];
               stak[i+1]=null;
           }
        }
        return firstNumber;
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
        for (int i = 0; i < stak.length; i++) {
           if (stak[i] != null) {
               System.out.println(stak[i]);
           }

        }

        }
    }

