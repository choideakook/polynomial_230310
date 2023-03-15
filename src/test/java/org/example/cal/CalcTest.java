package org.example.cal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CalcTest {

    @Test
    @DisplayName("1+1=2")
    void t1() {
        assertThat(Calc.run("1 + 1")).isEqualTo(2);
    }

    @Test
    @DisplayName("2+1=3")
    void t2() {
        assertThat(Calc.run("2 + 1")).isEqualTo(3);
    }

    @Test
    @DisplayName("2+2=4")
    void t3() {
        assertThat(Calc.run("2 + 2")).isEqualTo(4);
    }

    @Test
    @DisplayName("1000+280=1280")
    void t4() {
        assertThat(Calc.run("1000 + 280")).isEqualTo(1280);
    }

    @Test
    @DisplayName("50-30=20")
    void t6() {
        assertThat(Calc.run("50 - 30")).isEqualTo(20);
    }

    @Test
    @DisplayName("2-1=1")
    void t7() {
        assertThat(Calc.run("2 - 1")).isEqualTo(1);
    }

    @Test
    @DisplayName("10 + 20 + 30 = 60")
    void t8() {
        assertThat(Calc.run("10 + 20 + 30")).isEqualTo(60);
    }

    @Test
    @DisplayName("10 - 20 + 30 = 20")
    void t9() {
        assertThat(Calc.run("10 - 20 + 30")).isEqualTo(20);
    }

    @Test
    @DisplayName("10 - 10 - 10 - 10 = -20")
    void t10() {
        assertThat(Calc.run("10 - 10 - 10 - 10")).isEqualTo(-20);
    }

    @Test
    @DisplayName("10 * 10 = 100")
    void t11() {
        assertThat(Calc.run("10 * 10")).isEqualTo(100);
    }

    @Test
    @DisplayName("2 + 3 + 5 - 7 * 3 = -11")
    void t12() {
        assertThat(Calc.run("2 + 3 + 5 - 7 * 3")).isEqualTo(-11);
    }

    @Test
    @DisplayName("4 + 2 - 34 * 2 * -1 = 74")
    void t13() {
        assertThat(Calc.run("4 + 2 - 34 * 2 * -1")).isEqualTo(74);
    }

    @Test
    @DisplayName("3 * 2 - 4 * 5 = -12")
    void t14() {
        assertThat(Calc.run("3 * 2 - 4 * 5")).isEqualTo(-14);
    }

    @Test
    @DisplayName("10 / 2 = 5")
    void t15() {
        assertThat(Calc.run("10 / 2")).isEqualTo(5);
    }

    @Test
    @DisplayName("3 * 2 / 2 = 3")
    void t16() {
        assertThat(Calc.run("3 * 2 / 2")).isEqualTo(3);
    }

    @Test
    @DisplayName("-10 / 5 * 9 = 18")
    void t17() {
        assertThat(Calc.run("-10 / 5 * 9")).isEqualTo(-18);
    }

    @Test
    @DisplayName("3 * 2 + 4 - 10 / 5 * 9 - 20 * 4 - 0 = -70")
    void t18() {
        assertThat(Calc.run("3 * 2 + 4 - 10 / 5 * 9 - 20 * 4 - 0")).isEqualTo(-88);
    }

    @Test
    @DisplayName("(10 + 20)= 30")
    void t19() {
        assertThat(Calc.run("(10 + 20)")).isEqualTo(30);
    }

    @Test
    @DisplayName("(20 + 30) * 4 + ((3 - 5) + 1) = 199")
    void t20() {
        assertThat(Calc.run("(20 + 30) * 4 + ((3 - 5) + 1)")).isEqualTo(199);
    }

    @Test
    @DisplayName("30 / (3 - 6 + ((5 + 7))) * 8 + (4) * 3 / (7 * 5 / 10 * 6) + 2 = 26")
    void t21() {
        assertThat(Calc.run("30 / (3 - 6 + ((5 + 7))) * 8 + (4) * 3 / (7 * 5 / 10 * 6) + 2")).isEqualTo(26);
    }

    @Test
    @DisplayName("30 / (3 - 6 + ((5 + 7))) * 8 = 24")
    void t22() {
        assertThat(Calc.run("30 / (3 - 6 + ((5 + 7))) * 8")).isEqualTo(24);
    }

    @Test
    @DisplayName("(4) * 40 / (7 * 5 / 10 * 6) + 2 = 10")
    void t23() {
        assertThat(Calc.run("(4) * 40 / (7 * 5 / 10 * 6) + 2")).isEqualTo(10);
    }

    @Test
    @DisplayName("7 * 5 / 10 * 6 = 18")
    void t24() {
        assertThat(Calc.run("7 * 5 / 10 * 6")).isEqualTo(18);
    }

    @Test
    @DisplayName("(10 + 20) * 3 == 90")
    void t230() {
        assertThat(Calc.run("(10 + 20) * 3")).isEqualTo(90);
    }


    @Test
    @DisplayName("10 + (10 + 5) == 25")
    void t240() {
        assertThat(Calc.run("10 + (10 + 5)")).isEqualTo(25);
    }



}