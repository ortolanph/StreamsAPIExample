
public class MyStreamedMathExamples {
    public static void main(String[] args) {
        for(int i = 0; i < 21; i++) {
            System.out.printf("factorial(%d) = %d\n", i, MyStreamedMath.factorial(i));
        }

        for(int b = 1; b < 11; b++) {
            for(int e = 0; e < 11; e ++) {
                System.out.printf("exponential(%d,%d) = %d\n", b, e, MyStreamedMath.exponential(b,e));
            }
        }
    }
}
