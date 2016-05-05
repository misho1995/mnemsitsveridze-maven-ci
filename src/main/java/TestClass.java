/**
 * Created by misho on 5/5/2016.
 */
public class TestClass {
    private Operation op;

    public TestClass(Operation op) {
        this.op = op;
    }

    public int getSum(int a, int b){
        return op.doOperation(a, b);
    }
}
