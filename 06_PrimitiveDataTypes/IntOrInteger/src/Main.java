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
            System.out.println((int)letter + " - Это заглавная буква " + letter);
        }

        int i = 'Ё';
        System.out.println(i + " - Это заглавная буква " + "Ё");

        for (char letter = 'Ж'; letter <= 'Я'; letter++) {
            System.out.println((int)letter + " - Это заглавная буква " + letter);
        }

        for (char letter = 'а'; letter <= 'е'; letter++) {
            System.out.println((int)letter + " - Это строчная буква " + letter);
        }

        int y = 'ё';
        System.out.println(y + " - Это строчная буква " + "ё");

        for (char letter = 'ж'; letter <= 'я'; letter++) {
            System.out.println((int)letter + " - Это строчная буква " + letter);
        }
    }

}
