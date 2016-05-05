import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by misho on 5/5/2016.
 */
public class Tester {
    @Test
    public void testSumSimple(){
        Operation op = new Operation();
        TestClass summer = new TestClass(op);
        assertEquals(summer.getSum(1, 2), 3);
    }
}
