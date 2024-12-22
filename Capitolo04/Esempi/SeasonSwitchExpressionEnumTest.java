import java.time.Month;

public class SeasonSwitchExpressionEnumTest {
    public static void main(String args[]) {
        Month month = Month.APRIL;
        String season = switch(month) {
                case DECEMBER, JANUARY, FEBRUARY -> "winter";
                case MARCH, APRIL, MAY -> "spring";
                case JUNE, JULY, AUGUST -> "summer";
                case SEPTEMBER, OCTOBER, NOVEMBER -> "autumn";
                default -> {
                    String value = "not identificable";
                    yield value;
                }
        };
        System.out.println("The season is " + season);
    }
}