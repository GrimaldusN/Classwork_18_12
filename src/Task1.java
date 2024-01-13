import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {
        Length(str -> System.out.println(str.length()),"super");
        Operation((int1, int2) -> System.out.println(int1 + int2), 56, 2);
        Operation((int1, int2) -> System.out.println(int1 - int2), 56, 2);
        Operation((int1, int2) -> System.out.println(int1 * int2), 56, 2);
        Operation((int1, int2) -> System.out.println(int1 / int2), 56, 2);
        SafeDivision safeDivide = (a, b) -> b == 0 ? Optional.empty() : Optional.of(a / b);
        System.out.println("Результат: " + safeDivide.divide(6 , 5).orElse(Double.NaN));
        UpperCaseConverter upperCaseConverter = (String) -> String.toUpperCase(Locale.ROOT);
        String str = "sfasfs";
        System.out.println("Result: " + upperCaseConverter.convert(str));
//        System.out.println(Log(str, ));
    }

    public static void Length(StringLength s, String str){
        s.getLength(str);
    }

    public static void Operation(NumberOperation numbrs, int int1, int int2){
        numbrs.operate(int1, int2);
    }

    public static void UpperCase(String str, UpperCaseConverter converter){
        converter.convert(str);
    }

    public static void Log(String str, Logger log){
        log.log(str);
    }
}



@FunctionalInterface
interface StringLength{
    void getLength(String str);
}

@FunctionalInterface
interface NumberOperation{
    void operate(int int1, int int2);
}

@FunctionalInterface
interface SafeDivision {

    Optional<Double> divide(double one , double two);
}

@FunctionalInterface
interface UpperCaseConverter {
    String convert(String str);
}

@FunctionalInterface
interface Logger{
    void log(String str);
}

@FunctionalInterface
interface ArrayTransfirmer{
    void transform(Arrays[] arrays);
}
