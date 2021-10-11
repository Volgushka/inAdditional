public class Main {
    public static void main(String[] args) {

        System.out.println("Площадь круга при радиусе 5 метров равна "+ GeometryCalculator.getCircleSquare(5));
        System.out.println("Объем шара при радиусе 5 метров равна "+ GeometryCalculator.getSphereVolume(5) +" м. в кубе");
        System.out.println("Площадь треугольника равна "+GeometryCalculator.getTriangleSquare(6,4,9) +" м. в кв.");
    }
}
