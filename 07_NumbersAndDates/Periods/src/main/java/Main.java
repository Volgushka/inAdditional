import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.LocalDateTime;

public class Main {

  public static void main(String[] args) {

    LocalDate javaBirthday = LocalDate.of(1995, 05, 23);

    System.out.println(getPeriodFromBirthday(javaBirthday));
  }

  private static String getPeriodFromBirthday(LocalDate javaBirthday) {

    LocalDate nowDay = LocalDate.now();
    long years = ChronoUnit.YEARS.between(javaBirthday, nowDay);
    long monthes = ChronoUnit.MONTHS.between(javaBirthday, nowDay)%12;
    LocalDate midtermData = javaBirthday.plusYears(years).plusMonths(monthes);
    long days = ChronoUnit.DAYS.between(midtermData, nowDay);

    return years + " years"+ ", " +  monthes + " months"+ ", " + days  + " days";
  }

}
//25 years, 4 months, 6 days