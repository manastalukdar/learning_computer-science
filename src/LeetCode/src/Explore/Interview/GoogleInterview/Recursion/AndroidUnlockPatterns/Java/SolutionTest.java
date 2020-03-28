package LeetCode.src.Explore.Interview.GoogleInterview.Recursion.AndroidUnlockPatterns.Java;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class SolutionTest {
    
    Solution solution;
    
    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution();
    }
    
    @AfterEach
    public void tearDown() throws Exception {
        solution = null;
    }
    
    @Test
    public void MainFunction() {
        assertTimeout(Duration.ofMillis(700), () -> {
             String[] args = new String[0];
             assertAll(() -> Solution.main(args));
        });
    }
    
    @Test
    public void TrivialCase1() {
        int m = 1;
        int n = 1;
        assertTimeout(Duration.ofMillis(700), () -> {
            int expected = 9;
            int actual = Solution.numberOfPatterns(m, n);
            assertEquals(expected, actual);
        });
    }
}