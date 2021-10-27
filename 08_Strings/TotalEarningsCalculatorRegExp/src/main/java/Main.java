import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    System.out.println(calculateSalarySum(text));

  }

  public static int calculateSalarySum(String text){
    int SalarySum = 0;
    String regex ="[0-9]+";

    Pattern pat = Pattern.compile(regex);
    Matcher mat = pat.matcher(text);
    while (mat.find()){
      int start = mat.start();
      int end = mat.end();

      int salary = Integer.parseInt(text.substring(start,end));
      SalarySum = SalarySum + salary;
    }
    return SalarySum;
  }

}