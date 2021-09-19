public class Dimensions {

    private final int width;
    private final int length;
    private final int height;

    public Dimensions(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int getCargoVolume(int width, int length, int height){
         int CargoVolume = width * length * height;
         return CargoVolume;
    }

}
