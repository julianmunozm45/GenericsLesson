package example;

public class EitherExample {

    public static void main(String[] args) {
        Either<String, Integer> resultSuccess = Either.right(42);
        Either<String, Integer> resultFailure = Either.left("Error occurred");

        String successMessage = resultSuccess.fold(
                error -> "Failed with error: " + error,
                value -> "Success with value: " + value
        );

        String failureMessage = resultFailure.fold(
                error -> "Failed with error: " + error,
                value -> "Success with value: " + value
        );

        System.out.println(successMessage); // Output: Success with value: 42
        System.out.println(failureMessage); // Output: Failed with error: Error occurred
    }
}
