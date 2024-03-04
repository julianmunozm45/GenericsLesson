package part5;

public class ForbiddenGenerics<T> {
//    List<int> badList; // Primitives can not be instatiated in generic classes

//    public T newInstance () { // Cannot create instances from the generic parameter
//        return new T();
//    }

//    private static T badStatic; // The generic type belongs to the instance not the class

//    public static void doSomething(T value) {}

    public static <U> void doSomethingGeneric(U value) {} // valid since it's not the class type

//    public void myMethod() {
//        try {
//            // some code
//            throw new MyGenericException<>();
//        } catch (MyGenericException e) {
//            // compile time error
//        }
//    }
//
//    public static class MyGenericException<T> extends Exception {
//
//    }

//    T[] array = new T[5];
}