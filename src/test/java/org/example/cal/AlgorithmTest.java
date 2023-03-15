package org.example.cal;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;


class AlgorithmTest {

    @Test
    void t1() {
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;
        int[] answer = new int[id_list.length];
        //---------------------//



        for (int i : answer) {
            System.out.println(i);
        }
    }

    @Test
    void t2() {
        Algorithm algorithm = new Algorithm();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] answer = {2,1,1,0};
        assertThat(algorithm.run(id_list, report, k)).isEqualTo(answer);
    }
}