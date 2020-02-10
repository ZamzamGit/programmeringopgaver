package stak;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayStak stak = new ArrayStak();

        stak.push("k");
        stak.push("m");
        stak.push("l");
        stak.push("o");
        stak.push("aa");
        stak.show();
        stak.isFull();

         stak.push("oo");
         stak.push("lllll");
        stak.push("oo1");
        stak.push("llll2l");
        stak.show();

        System.out.println("//////////////////////");
        stak.pop();
        stak.show();
    }
}
