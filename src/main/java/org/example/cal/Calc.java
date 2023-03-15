package org.example.cal;

import java.util.Stack;

public class Calc {

    public static int run(String exp) { //
        int result = 0;

        exp = exp.replace("- ", "+ -"); // (10 + 20)

        if (exp.contains("(")) exp = token(exp);


        String[] bits = exp.split(" \\+ ");
        for (int i = 0; i < bits.length; i++) {

            if (bits[i].contains("*"))
                bits[i] = multiply(bits[i]);

            if (bits[i].contains("/"))
                bits[i] = division(bits[i]);

            result += Integer.parseInt(bits[i]);
        }
        return result;
    }

    private static String token(String exp) {
        StringBuilder sb = new StringBuilder(exp);
        int first = 0;
        int last = 0;
        String result = "";

        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(')
                first = i;
            else if (exp.charAt(i) == ')') {
                last = i;
                String token = exp.substring(first + 1, last);
                result = String.valueOf(run(token));
                break;
            }
        }
        exp = sb.replace(first, last + 1, result).toString();
        if (exp.contains("(")) exp = token(exp);
            return exp;
    }

    private static String division(String bits) {
        String[] mul = bits.split(" / ");
        int num = Integer.parseInt(mul[0]);

        for (int j = 1; j < mul.length; j++)
            num /= Integer.parseInt(mul[j]);

        return String.valueOf(num);
    }

    private static String multiply(String bits) {
        String[] mul = bits.split(" \\* ");
        int num = 0;
        try {
            num = Integer.parseInt(mul[0]);
        } catch (Exception e) {
            num = Integer.parseInt(division((mul[0])));
        }

        for (int j = 1; j < mul.length; j++)
            try {
                num *= Integer.parseInt(mul[j]);
            } catch (Exception e) {
                num *= Integer.parseInt(division(mul[j]));
            }
        return String.valueOf(num);
    }

}
