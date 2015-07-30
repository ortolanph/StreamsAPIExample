/**
 * Created by ortolanph on 7/29/15.
 */
public enum Operation implements OperationStrategy<Double> {
    ADDITION((x, y) -> x + y),
    SUBTRACTION((x, y) -> x - y),
    MULTIPLY((x, y) -> x * y),
    DIVIDE((x, y) -> x / y),
    MAX(Double::max),
    MIN(Double::min)
    ;

    private OperationStrategy<Double> operationStrategy;

    private Operation(OperationStrategy<Double> operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    @Override
    public Double compute(Double x, Double y) {
        return operationStrategy.compute(x, y);
    }
}
