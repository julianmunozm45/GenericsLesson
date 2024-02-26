package example;

import java.util.function.Function;

public abstract class Either<L, R> {
    private Either() {}

    public static <L, R> Either<L, R> left(L value) {
        return new Left<>(value);
    }

    public static <L, R> Either<L, R> right(R value) {
        return new Right<>(value);
    }

    public abstract <T> T fold(Function<L, T> leftFn, Function<R, T> rightFn);

    private static class Left<L, R> extends Either<L, R> {
        private final L value;

        private Left(L value) {
            this.value = value;
        }

        @Override
        public <T> T fold(Function<L, T> leftFn, Function<R, T> rightFn) {
            return leftFn.apply(value);
        }
    }

    private static class Right<L, R> extends Either<L, R> {
        private final R value;

        private Right(R value) {
            this.value = value;
        }

        @Override
        public <T> T fold(Function<L, T> leftFn, Function<R, T> rightFn) {
            return rightFn.apply(value);
        }
    }
}

