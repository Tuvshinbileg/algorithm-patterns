package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import main.TwoPointer;

public class TwoPointerTest {

    @Test
    void test_1() {
        int[] case_num = {-1, 0, 1, 2, -1, -4};
        var result = TwoPointer.threeSum(case_num);

        Assertions.assertEquals(2, result.size());
        result.forEach(el -> System.out.println(Arrays.toString(el.toArray())));
    }

    @Test
    void test_2() {
        int[] case_num = {0, 1, 1};
        var result = TwoPointer.threeSum(case_num);
        result.forEach(el -> System.out.println(Arrays.toString(el.toArray())));

        Assertions.assertEquals(0, result.size());
    }

    @Test
    void test_3() {
        int[] case_num = {0, 1, 1};
        var result = TwoPointer.threeSum(case_num);
        result.forEach(el -> System.out.println(Arrays.toString(el.toArray())));
    }
}