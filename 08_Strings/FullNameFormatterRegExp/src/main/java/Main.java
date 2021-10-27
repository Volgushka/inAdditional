import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     while (true) {
     String input = scanner.nextLine();
     if (input.equals("0")) {
        break;
      }
      String LETTERS = "[АБВГДЕЁЖЗИКЛМНОПРСТУФХЦЧШЩЬЪЭЮЯ]";
      String letters = "[абвгдеёжзиклмнопрстуфхцчшщьъэюя]";


      String regex = "^([А-Я]{1}[а-я]{1,}-?[А-Я]{0,1}[а-я]{0,})\\s([А-Я]{1}[а-я]+)\\s([А-Я]{1}[а-я]{1,})$";
   //      String regex = "^([А-Я]{1}[а-я]{1,})\\s([А-Я]{1}[а-я]+)\\s([А-Я]{1}[а-я]{1,})$";

      if (input.matches(regex)) {

          Pattern mainPat = Pattern.compile(regex);
          Matcher mainMat = mainPat.matcher(input);
          mainMat.find();


        System.out.println("Фамилия: " + mainMat.group(1));
        System.out.println("Имя: " + mainMat.group(2));
        System.out.println("Отчество: " + mainMat.group(3));


//        String mainRegex = "[А-Я]{1}[а-я]{2,}(-[А-Я]{1}[а-я]{1,})?";
//        Pattern mainPat = Pattern.compile(mainRegex);
//        Matcher mainMat = mainPat.matcher(input);
//        while (mainMat.find()) {
//          int start = mainMat.start();
//          int end = mainMat.end();
//
//          System.out.println(input.substring(start, end));
        }
      else {System.out.println("Введенная строка не является ФИО");}
    }

  }
}