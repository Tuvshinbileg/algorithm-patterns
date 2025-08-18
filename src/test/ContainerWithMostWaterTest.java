package test;

import main.problems.ContainerWithMostWater;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {

    @Test
    void test_1() {
        int[] case_num = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        var result = new ContainerWithMostWater().maxArea(case_num);
        Assertions.assertEquals(49, result);
    }

    @Test
    void test_2() {
        int[] case_num = {1, 1};

        var result = new ContainerWithMostWater().maxArea(case_num);
        Assertions.assertEquals(1, result);
    }
}