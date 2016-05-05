import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by misho on 5/5/2016.
 */
public class Tester {
    @Mock private Operation op;

    private TestClass summer;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        summer = new TestClass(op);
    }

    @Test
    public void testSumSimple(){
        Operation oper = new Operation();
        TestClass sum = new TestClass(oper);
        assertEquals(sum.getSum(1, 2), 3);
    }

    @Test
    public void testUsingMock(){
        when(op.doOperation(5, 4)).thenReturn(9);
        assertEquals(summer.getSum(5, 4), 9);
    }
}
