package racingcar;

public class Car {
    String name;
    int moveCount;

    public Car(String name) {
        this.name = name;
        this.moveCount = 0;
    }

    public void move() {
        moveCount++;
    }

    public int getMoveCount() {
        return moveCount;
    }
}