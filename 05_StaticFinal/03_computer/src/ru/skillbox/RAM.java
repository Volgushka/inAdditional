public class RAM {

    private String ramType;
    private int ramVolume; //объем Гигабайт
    private double ramWeight;

    public RAM(String ramType, int ramVolume, double ramWeight) {
        this.ramType = ramType;
        this.ramVolume = ramVolume;
        this.ramWeight = ramWeight;
    }

    public double getRamWeight() {
        return ramWeight;
    }

    public String toStringRAM(){
        return "Информация об оперативной памяти| " + "Тип:"+ " " + ramType + "; " + "Объем (Гб):"+ " "+ ramVolume + "; "  + "Вес ОП:"+ " "+ ramWeight;
    }

}