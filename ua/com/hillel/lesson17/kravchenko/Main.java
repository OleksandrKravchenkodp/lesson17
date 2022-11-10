package ua.com.hillel.lesson17.kravchenko;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        Predicate<Double> predicate = (salary) -> salary > 1500.00;
        System.out.println(predicate.test(1250.01));
        System.out.println(predicate.test(1550.50));

        System.out.println();

        Consumer<String> consumer = (stringArr) -> System.out.println(stringArr.toCharArray());
        consumer.accept("Some String");

        System.out.println();

        Function<Integer, String> function = (count) -> {
            String str = null;
            if (count < 1 || count > 10) str = "unknow";
            if (count == 1) str = "One";
            if (count == 2) str = "Two";
            if (count == 3) str = "Three";
            if (count == 4) str = "Four";
            if (count == 5) str = "Five";
            if (count == 6) str = "Six";
            if (count == 7) str = "Seven";
            if (count == 8) str = "Eight";
            if (count == 9) str = "Nine";
            if (count == 10) str = "Ten";
            System.out.println(str);
            return str;
        };
        function.apply(5);
        function.apply(-5);

        System.out.println();

        Supplier<String> supplier = () -> new String("New String");
        System.out.println(supplier.get());

        System.out.println();

        BiFunction<Double, Integer, String> biFunction = (biFunctionDouble, biFunctionInteger) -> {
            String result;
            double resultNumber = biFunctionDouble - biFunctionInteger;
            if (resultNumber < 1) result = "Remainder less than 1";
            else result = String.valueOf(resultNumber);
            System.out.println(result);
            return result;
        };
        biFunction.apply(125.5, 5);
        biFunction.apply(125.5, 127);

        System.out.println();

        CheckSalary<Integer, Integer, Double, Double, String> checkSalary = (integer1, integer2, aDouble1, aDouble2)
                -> String.valueOf(integer1 + integer2 + aDouble1 + aDouble2);
        String resultFactor = checkSalary.checkSalary(21, 1, 15.5, 23.3);
        System.out.println(resultFactor);

        System.out.println();

        ToDoubleFunction<Integer> toDoubleFunction = a -> a / 2;
        System.out.println(toDoubleFunction.applyAsDouble(3));

    }

}
