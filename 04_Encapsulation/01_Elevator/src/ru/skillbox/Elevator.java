

import java.util.Scanner;

public class Elevator {

    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
            currentFloor = currentFloor - 1;
        }

    public void moveUp() {
            currentFloor = currentFloor + 1;
        }

    public void move(int floor) {

        if (floor < minFloor | floor > maxFloor) {
            System.out.println("Такого этажа в здании нет. Сделайте правильный выбор");

        }
         else {
            while (getCurrentFloor() != floor) {

                if (getCurrentFloor() > floor) {
                    moveDown();
                    System.out.println("Сейчас вы на " + getCurrentFloor() + " этаже");
                } else {
                    moveUp();
                    System.out.println("Сейчас вы на " + getCurrentFloor() + " этаже");
                }


                if (getCurrentFloor() == floor) {
                    System.out.println("Вы приехали на свой этаж!");
                    System.out.println("Выходите!");
                    System.out.println("Если не вышли, то ....");
                }
            }
        }
    }
}
