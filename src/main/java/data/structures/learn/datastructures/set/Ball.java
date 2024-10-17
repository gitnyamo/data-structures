package data.structures.learn.datastructures.set;

import java.util.Objects;

public class Ball {


    String color;

    public Ball(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Objects.equals(color, ball.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
