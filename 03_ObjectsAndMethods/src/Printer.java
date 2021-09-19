public class Printer {

    public String quele = "";
    public static int pendingPagesCount = 0;
    public static int alltimePages = 0;

    public void append(String text) {
        append(text,  "Hello", 1);
    }

    public void append(String text, String nameText) {
        append(text, nameText,  1 );
    }
    public void append(String text, String nameText, int countPagesText) {

        quele = nameText + "\n" + text;
        pendingPagesCount = pendingPagesCount + countPagesText;
    }

    public void clear(int countPagesText) {
        quele = "";
        pendingPagesCount = pendingPagesCount - countPagesText;

    }

    public void print(String quele,String nameText,int countPagesText) {
        System.out.println("Необходимое количество бумаги -" + countPagesText);
        System.out.println ("Идет печать" + nameText);
        alltimePages = alltimePages + countPagesText;
        clear(countPagesText);

    }
    public int getPendingPagesCount() {
        return pendingPagesCount;
    }

    public int getAlltimePages() {
        return alltimePages;
    }


}
