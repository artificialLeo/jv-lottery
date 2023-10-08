package core.basesyntax;

import java.util.Random;

public class Ball {
    String color;

    int number;

    public Ball() {
        this.color = new ColorSupplier().getRandomColor();
        this.number = new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number='" + number + '\''
                + '}';
    }
}
