package com.tbp;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;

    @Before
    public void doBefore() {
        solution = new Solution();
    }


    @Test
    public void testSolution() {
        int A[] = new int[]{1,2,1};
        assertEquals(0, solution.solution(A));
    }


}
