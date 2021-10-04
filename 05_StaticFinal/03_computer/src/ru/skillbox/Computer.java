public class Computer {

    public final String vendor;
    public final String name;

    private final CPU cpu;                                            //процессор
    private final RAM ram;                                            //оперативная память
    private final InfStorage information_storage;                     //накопитель информации
    private final Screen screen;                                      //экран
    private final Keyboard keyboard;                                  //клавиатура


    public Computer(String vendor, String name, CPU cpu, RAM ram, InfStorage information_storage, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.information_storage = information_storage;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public CPU getCpu() {
        return cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public InfStorage getInformation_storage() {
        return information_storage;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Computer setCpu(CPU cpu) {
        return new Computer(vendor, name, cpu, ram, information_storage, screen, keyboard);
    }

    public Computer setRam(RAM ram) {
        return new Computer(vendor, name, cpu, ram, information_storage, screen, keyboard);
    }

    public Computer setInformation_storage(InfStorage information_storage) {
        return new Computer(vendor, name, cpu, ram, information_storage, screen, keyboard);
    }

    public Computer setScreen(Screen screen) {
        return new Computer(vendor, name, cpu, ram, information_storage, screen, keyboard);
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(vendor, name, cpu, ram, information_storage, screen, keyboard);
    }

    public double getSummWeight() {
        double SummWeight = getCpu().getCpuWeight() + getRam().getRamWeight() + getInformation_storage().getStorageWeight()
                + getScreen().getScreenWeight() + getKeyboard().getKbWeight();
        return SummWeight;
    }

    @Override
    public String toString(){
        return "Компьютер" + " "+name + " " + vendor+ "\r\n" + cpu.toStringCPU() + "\r\n" + ram.toStringRAM() + "\r\n"  + information_storage.toStringIS() + "\r\n"+ screen.toStringScreen() + "\r\n"  + keyboard.toStringKB();
    }


}




