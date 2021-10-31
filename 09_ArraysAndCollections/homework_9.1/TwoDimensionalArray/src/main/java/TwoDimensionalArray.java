public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        char[][] TwoDimensionalArray = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || j == (size-i-1)){
                    TwoDimensionalArray[i][j] = symbol;
                }
                else {
                    TwoDimensionalArray[i][j] = ' ';
                }
            }
        }

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        return TwoDimensionalArray;
    }
}
