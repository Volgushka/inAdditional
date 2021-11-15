public class Main {

    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int[][] overturn = new int[a][b];
        int ij = 0;

        for (int i = 0; i < overturn.length; i++) {// создаем массив
            for (int j = 0; j < overturn[i].length; j++) {
                overturn[i][j] = j + ij + 1;
                System.out.print(overturn[i][j] +  " ");
            }
            ij += b;
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < overturn.length; i++) {// выводим перевернутый
            for (int j = 0; j < overturn[i].length; j++) {
                System.out.print(overturn[j][i] + " ");
            }
            System.out.println();
            }
        }
        }

