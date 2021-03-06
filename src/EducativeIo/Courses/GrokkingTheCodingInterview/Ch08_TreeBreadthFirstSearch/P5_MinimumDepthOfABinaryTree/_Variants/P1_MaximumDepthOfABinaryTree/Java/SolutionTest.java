package EducativeIo.Courses.GrokkingTheCodingInterview.Ch08_TreeBreadthFirstSearch.P5_MinimumDepthOfABinaryTree._Variants.P1_MaximumDepthOfABinaryTree.Java;

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
        assertTimeout(Duration.ofMillis(1000), () -> {
            String[] args = new String[0];
            assertAll(() -> Solution.main(args));
        });
    }

    @Test
    public void TrivialCase1() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        assertTimeout(Duration.ofMillis(1000), () -> {
            int expected = 3;
            int actual = Solution.findDepth(root);
            assertEquals(expected, actual);
        });
    }

    @Test
    public void TrivialCase2() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        root.left.left = new TreeNode(9);
        root.right.left.left = new TreeNode(11);
        assertTimeout(Duration.ofMillis(1000), () -> {
            int expected = 4;
            int actual = Solution.findDepth(root);
            assertEquals(expected, actual);
        });
    }
}
