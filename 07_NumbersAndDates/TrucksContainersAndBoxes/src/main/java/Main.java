import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Введите количество ящиков: ");
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();
        int boxesInt = Integer.parseInt(boxes);
        int boxesInContainer = 27;
        int containerInTruck = 12;

        int fullContainers = boxesInt / boxesInContainer;
        int notfullContainers = (boxesInt % boxesInContainer > 0) ? 1 : 0;
        int totalContainers = fullContainers + notfullContainers;

        int fullTrucks = (fullContainers + notfullContainers) / containerInTruck;
        int notfullTrucks = (fullContainers + notfullContainers) % containerInTruck > 0 ? 1 : 0;
        int totalTrucks = fullTrucks + notfullTrucks;

        if(boxesInt == 0){

            System.out.println("Необходимо:" + System.lineSeparator() + "грузовиков - " + 0 + " шт."
                    + System.lineSeparator() + "контейнеров - " + 0 + " шт.");
        }
        int countContainers = 0;
        int countBoxes = 0;

            for (int t = 1; t <= totalTrucks; t++) {
                System.out.println("Грузовик: " + t);
                for (int i = 1; i <= 12; i++) {
                    countContainers += 1;
                    System.out.println("\tКонтейнер: " + countContainers);
                    for (int y = 1; y <= 27; y++) {
                        countBoxes += 1;
                        System.out.println("\t\tЯщик: " + countBoxes);
                        if(countBoxes >= boxesInt){
                            System.out.println("Необходимо:" + System.lineSeparator() + "грузовиков - " + totalTrucks + " шт."
                                    + System.lineSeparator() + "контейнеров - " + totalContainers + " шт.");
                            return;
                        }
                    }
                }
            }
        }
    }


