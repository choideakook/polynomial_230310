package org.example.cal;

public class Calc {

    public static int run(String exp) { // 10 x 10 = 100
        int result = 0;

        exp = exp.replace("- ", "+ -");
        String[] bits = exp.split(" \\+ ");

        for (int i = 0; i < bits.length; i++)
            result += Integer.parseInt(bits[i]);

        return result;
    }


}
