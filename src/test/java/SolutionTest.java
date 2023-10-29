import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class SolutionTest {
    @Test
    public void addOperatorsTest1() {
        String num = "123";
        int target = 6;
        List<String> expected = new ArrayList<>(List.of("1*2*3", "1+2+3"));
        List<String> actual = new Solution().addOperators(num, target);
        Collections.sort(expected);
        Collections.sort(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addOperatorsTest2() {
        String num = "232";
        int target = 8;
        List<String> expected = new ArrayList<>(List.of("2*3+2", "2+3*2"));
        List<String> actual = new Solution().addOperators(num, target);
        Collections.sort(expected);
        Collections.sort(actual);
        Assert.assertEquals(expected, actual);
    }
}
