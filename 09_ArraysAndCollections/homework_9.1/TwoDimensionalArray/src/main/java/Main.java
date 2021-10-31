public class Main {
    public static void main(String[] args) {

        char[][] resultArray = TwoDimensionalArray.getTwoDimensionalArray(5);
        for (int i = 0; i < resultArray.length; i++) {  //идём по строкам
            for (int j = 0; j < resultArray[0].length; j++) {//идём по столбцам
                System.out.print(resultArray[i][j]); //вывод элемента
                            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
        //Распечатайте сгенерированный в классе TwoDimensionalArray.java двумерный массив
    }
}
