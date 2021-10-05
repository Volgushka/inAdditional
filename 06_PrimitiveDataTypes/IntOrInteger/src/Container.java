import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class Container {
    private Integer count;

    public void addCount(int value) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        count = s.nextInt();
        count = count + value;
    }

    public int getCount() {
        return count;
    }
}
