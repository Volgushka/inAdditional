import java.util.List;
public class Main {

  public static void main(String[] args) {
    System.out.println(splitTextIntoWords("Everyone could notice that people."));
  }

  public static String splitTextIntoWords(String text) {
    String reget ="[0-9]|:|;|!|\\.|\\,|";
    text = text.replaceAll(reget, "").replace('-',' ');

    String list[] = text.split("\\s+");
    String result = "";

    for(int i = 0; i < list.length-1; i++) {
        result = result + list[i] + System.lineSeparator();
      }

    return result+list[list.length-1];
    }
}