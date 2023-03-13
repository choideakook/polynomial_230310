package org.example.cal;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class AlgorithmTest {

    @Test
    void t1() {
        String s = "(())()";
        boolean answer = true;
        //---------------------//

        int check = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') check += 1;
            else check += -1;

            if (check < 0) {
                answer = false;
                break;
            }
        }
        if (answer) answer = check == 0 ? true : false;


        System.out.println(answer);
    }


    @Test
    void t2() {
        String a = "5efsfd";
        String[] split = a.split("");
//        System.out.println(a);

        for (String s : split) System.out.println(s);
    }
}