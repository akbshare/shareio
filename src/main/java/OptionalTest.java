import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        String value1 = "";
        Integer value = 123;
        Optional<Integer> decimalDigit = Optional.ofNullable(10);

        System.out.println(decimalDigit.get());
    }
}
