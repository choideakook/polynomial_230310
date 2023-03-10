package org.example.cal;

public class Calc {

    public static int run(String exp) { //"50-30=20"
        int result = 0;

        if (exp.contains(" - ")) {
            String[] bits = exp.split(" \\- ");
            result += Integer.parseInt(bits[0]);

            for (int i = 1; i < bits.length; i++)
                result -= Integer.parseInt(bits[i]);

            return result;

        } else {
            String[] bits = exp.split(" \\+ ");

            for (int i = 0; i < bits.length; i++)
                result += Integer.parseInt(bits[i]);

            return result;
        }
    }


}
