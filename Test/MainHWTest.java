import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.third.hw.MainHW;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

public class MainHWTest {

    MainHW mainHWTask1;
    MainHW mainHWTask2;
    MainHW mainHWTask3;

    @BeforeEach
    void setUp() {
        mainHWTask1 = new MainHW();
        mainHWTask2 = new MainHW();
        mainHWTask3 = new MainHW();
    }

//    Test Task1

//    @Test
//    void checkingEvenOddNumberTrue() {
//
//        assertTrue(mainHWTask1.evenOddNumber(10));
//    }
//
//    @Test
//    void checkingEvenOddNumberFalse() {
//
//        assertFalse(mainHWTask1.evenOddNumber(11));
//    }

//    *********************************************

//        Test Task2

//    @Test
//    void checkingNumberInIntervalTrue() {
//
//        assertThat(mainHWTask2.numberInInterval(25)).isTrue();
////        assertThat(mainHWTask1.numberInInterval(100)).isTrue();
//    }
//
//    @Test
//    void checkingNumberInIntervalFalse() {
//
//        assertThat(mainHWTask2.numberInInterval(1)).isFalse();
////        assertThat(mainHWTask1.numberInInterval(101)).isFalse();
//    }
//
//    //    *********************************************
//
//    //    Test Task2V2
//
//
    @ParameterizedTest
    @ValueSource(ints = {25, 47, 67, 100, 45})
    void checkingNumberInIntervalTrueV2(int number) {

        assertThat(mainHWTask3.numberInIntervalV2(number)).isTrue();
    }
//
    @ParameterizedTest
    @ValueSource(ints = {12, 1, 123, 13456, 5, 24})
    void checkingNumberInIntervalFalseV2(int number) {

        assertThat(mainHWTask3.numberInIntervalV2(number)).isFalse();

    }
}
