public class Main {

    public static void main(String[] args) {

        CPU cpu1 = new CPU(3.5, 4, "Intel", 0.4);
        RAM ram1 = new RAM("SRAM", 4, 0.02);
        InfStorage is1 = new InfStorage(StorageType.HDD, 500, 2);
        Screen screen1 = new Screen(17, ScreenType.IPS, 8);
        Keyboard keyboard1 = new Keyboard("mechanical", false, 1.3);

        Computer firstComp =
                new Computer("IBM", "2020", cpu1, ram1, is1, screen1, keyboard1);


        System.out.println("firstComp");
        System.out.println(firstComp.toString());
        System.out.println(firstComp.getSummWeight());
    }
}

