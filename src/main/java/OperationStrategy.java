@FunctionalInterface
public interface OperationStrategy<T> {
    T compute(T x, T y);
}
