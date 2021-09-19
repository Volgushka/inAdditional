public class Arithmetic {

    public int number1 = 0;
    public int number2 = 0;

    public Arithmetic(int a, int b){
        number1 = a;
        number2 = b;
    }

    public static int sum(int number1, int number2){
        return number1 + number2;
        }

    public static int mult(int number1, int number2){
        return number1 * number2;
    }

    public static int maxNum1Num2(int number1, int number2) {
        return Math.max(number1, number2);
    }
    public static int minNum1Num2(int number1, int number2) {
        if (number1 < number2) {
            return number1;
        } else  {
            return number2;
        }
    }
}
