/**
 * Created by 27975700819 on 30/07/15.
 */
public class OperationTest {
    public static void main(String[] args) {
        System.out.printf("Addition: %.2f + %.2f = %.2f\n", 1d, 1d, Operation.ADDITION.compute(1d, 1d));
        System.out.printf("Subtraction: %.2f + %.2f = %.2f\n", 1d, 1d, Operation.SUBTRACTION.compute(1d,1d));
        System.out.printf("Multiplication: %.2f * %.2f = %.2f\n", 7d, 3d, Operation.MULTIPLY.compute(7d,3d));
        System.out.printf("Division: %.2f / %.2f = %.2f\n", 10d, 5d, Operation.DIVIDE.compute(10d,5d));
        System.out.printf("Maximum between %.2f and %.2f is %.2f\n", -1d, -100d, Operation.MAX.compute(-1d,-100d));
        System.out.printf("Minimum between %.2f and %.2f is %.2f\n", -1d, -100d, Operation.MIN.compute(-1d,-100d));
    }
}
