public class Main {

    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());
        System.out.println();
        System.out.println("Алфавит");
        System.out.println();

        Main.alphabet();
    }

    public static void alphabet() {
        for (char letter = 'А'; letter <= 'Е'; letter++) {
            int NL = letter;
            System.out.println(NL + " - Это заглавная буква " + letter);
        }

        int i = 'Ё';
        System.out.println(i + " - Это заглавная буква " + "Ё");

        for (char letter = 'Ж'; letter <= 'Я'; letter++) {
            int NL = letter;
            System.out.println(NL + " - Это заглавная буква " + letter);
        }

        for (char letter = 'а'; letter <= 'е'; letter++) {
            int NL = letter;
            System.out.println(NL + " - Это строчная буква " + letter);
        }

        int y = 'ё';
        System.out.println(y + " - Это строчная буква " + "ё");

        for (char letter = 'ж'; letter <= 'я'; letter++) {
            int NL = letter;
            System.out.println(NL + " - Это строчная буква " + letter);
        }
    }

}
