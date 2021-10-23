public class Main {

  public static void main(String[] args) {

    String line = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

    System.out.println(sumSalary(line));

  }

  public static int sumSalary(String line) {

    int result = 0;
    String str = "рубл";

    //   for (char i : line.toCharArray()) {
    for (int i = 0; i < line.length(); i++) {
      if (Character.isWhitespace(line.toCharArray()[i]) && Character.isDigit(line.toCharArray()[i + 1])) {

        int beginIndex = line.indexOf(line.toCharArray()[i + 1]);
        int endIndex = line.indexOf(str);

        String salary = line.substring(beginIndex, endIndex);
        result = result + Integer.parseInt(salary.trim());
        line = line.replaceFirst(str, "****").replaceFirst(salary, ("*").repeat(endIndex - beginIndex));
      }
    }
  return result;
}
}




