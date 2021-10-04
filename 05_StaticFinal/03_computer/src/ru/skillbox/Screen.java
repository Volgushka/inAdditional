public class Screen {

    private final int diagonal;
    private final ScreenType screenType;
    private final double screenWeight;

    public Screen(int diagonal, ScreenType screenType, double screenWeight) {
        this.diagonal = diagonal;
        this.screenType = screenType;
        this.screenWeight = screenWeight;
    }

    public double getScreenWeight() {
        return screenWeight;
    }

    public String toStringScreen(){
        return "Информация об экране| " + "Диагональ(дюйм):"+ " " + diagonal + "; " + "Тип экрана:"+ " "+ screenType + ";" + " Вес экрана:"+ " "+ screenWeight;
    }


}
