package org.example.cal;

public class Calc {

    //-- 사칙 연산 계산 로직 --//
    public static int run(String exp) {
        int result = 0;
        exp = exp.replace("- ", "+ -");
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

    //-- 괄호 안의 수식 먼저 계산 --//
    private static String token(String exp) {
        StringBuilder sb = new StringBuilder(exp);
        int first = 0, last = 0;
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

    //-- 나눗셈 계센 --//
    private static String division(String bits) {
        String[] mul = bits.split(" / ");
        int num = Integer.parseInt(mul[0]);

        for (int j = 1; j < mul.length; j++)
            num /= Integer.parseInt(mul[j]);

        return String.valueOf(num);
    }

    //-- 곱셈 계산 --//
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
                String[] split = mul[j].split(" / ");
                num *= Integer.parseInt(split[0]);
                String division = division(num + " / " + split[1]);
                num = Integer.parseInt(division);
            }
        return String.valueOf(num);
    }

}
