import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddTest {

    Addition sum = new Addition();

@Test
    public void test_1() {

        assertEquals(sum.add(2, 2), 5);

    }

@Test
    public void test_2() {

        assertEquals(sum.add1(3, 3), 6);
    }
}
