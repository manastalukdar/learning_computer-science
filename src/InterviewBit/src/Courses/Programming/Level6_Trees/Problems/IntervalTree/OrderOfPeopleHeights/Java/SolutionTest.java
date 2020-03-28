package InterviewBit.src.Courses.Programming.Level6_Trees.Problems.IntervalTree.OrderOfPeopleHeights.Java;

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
        int[] A = {5, 3, 2, 6, 1, 4};
        int[] B = {0, 1, 2, 0, 3, 2};
        assertTimeout(Duration.ofMillis(700), () -> {
            int[] expected = {5, 3, 2, 1, 6, 4};
            int[] actual = Solution.order(A, B);;
            assertArrayEquals(expected, actual);
        });
    }
}