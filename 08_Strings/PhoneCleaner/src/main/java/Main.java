import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      String re = "[^0-9]";
      String result = input.replaceAll(re,"");

      if (result.length() == 11 && result.charAt(0) == '8'){
        result = 7+ result.substring(1);
      }

      else if (result.length() == 10 ){
        result = '7' + result;
      }
      String regex = "^7([0-9]{10})$";

      if (result.matches(regex)){
        System.out.println(result);
      }
      else {
        System.out.println("Неверный формат номера");
      }
      //TODO:напишите ваш код тут, результат вывести в консоль.
    }
  }

}
