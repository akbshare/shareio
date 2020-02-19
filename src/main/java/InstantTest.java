import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantTest {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.minusMillis(1));
        System.out.println(instant.truncatedTo(ChronoUnit.SECONDS));
        String test = "How are you!";
        System.out.println(test);
    }
}