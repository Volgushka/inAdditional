import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
        int count = 0;
        int gapCount = 0;
        for (char i : input.toCharArray()) {
            if(Character.UnicodeBlock.of(i).equals(Character.UnicodeBlock.CYRILLIC) || i == '-')
            {count = count + 1;}
            else if(i == ' '){gapCount += 1;}
    };

        if (count == input.length() - 2 && gapCount == 2) {
          int num = 1;
          String str = " ";

          int beginIndexSurname = 0;
          int endIndexSurname = input.indexOf(str);
          String surname = input.substring(beginIndexSurname, endIndexSurname);

          int beginIndexName = input.indexOf(str);
          int endIndexName = input.indexOf(str, input.indexOf(str) + num);
          ;
          String name = input.substring(beginIndexName, endIndexName);

          int beginIndexMiddleName = endIndexName + num;
          int endIndexMiddleName = input.length();
          String middleName = input.substring(beginIndexMiddleName, endIndexMiddleName);

          System.out.println("Фамилия: " + surname.trim());
          System.out.println("Имя: " + name.trim());
          System.out.println("Отчество: " + middleName.trim());
        }
      else{System.out.println("Введенная строка не является ФИО");}
        }
    }

  }
