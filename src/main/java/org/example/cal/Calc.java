package org.example.cal;

public class Calc {

    public static int run(String exp) { // 10 x 10 = 100
        int result = 0;

        exp = exp.replace("- ", "+ -");
        String[] bits = exp.split(" \\+ ");


        for (int i = 0; i < bits.length; i++) {

            if (bits[i].contains("*")) {
                bits[i] = multiply(bits[i]);
            }
            result += Integer.parseInt(bits[i]);
        }

        return result;
    }

    private static String multiply(String bits) {
        String[] mul = bits.split(" \\* ");
        int num = Integer.parseInt(mul[0]);

        for (int j = 1; j < mul.length; j++) {
            num *= Integer.parseInt(mul[j]);
        }

        return String.valueOf(num);
    }


}
