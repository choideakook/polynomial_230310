package org.example.cal;

public class Calc {

    public Calc(String param) {

    }

    public static int run(String exp) {

        String[] bits = exp.split(" \\+ ");
        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);

        return a + b;
    }
}
