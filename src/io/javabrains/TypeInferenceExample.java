package io.javabrains;

public class TypeInferenceExample {

    public static void main (String[] args) {
        StringLengthLambda myLambda = s -> s.length();
        System.out.println(myLambda.getLength("Hello Lambda"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
