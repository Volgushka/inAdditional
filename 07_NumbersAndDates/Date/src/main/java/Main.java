import com.puppycrawl.tools.checkstyle.checks.LineSeparatorOption;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;


public class Main {


    public static void main(String[] args) {
        int day = 12;
        int month = 8;
        int year = 2021;

        System.out.println(collectBirthdays(year, month, day));
    }

    public static String collectBirthdays(int year, int month, int day) {

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);

        long age = ChronoUnit.YEARS.between(birthday, today);
        //       long age = today.until(birthday, ChronoUnit.YEARS);
        String result = "";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEE", Locale.US);

        if (today.isAfter(birthday) || today.isEqual(birthday)) {
            for (int y = 0; y < age + 1; y++) {
                LocalDate birthdayNextYear = birthday.plusYears(y);
                result += y + " - " + formatter.format(birthdayNextYear) + " - " + formatter2.format(birthdayNextYear.getDayOfWeek()) + System.lineSeparator();
            }
        }
            return result;
        }
    }


