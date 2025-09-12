class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

public class MethodParamAndReturnType {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(7, 10);
    }
}
