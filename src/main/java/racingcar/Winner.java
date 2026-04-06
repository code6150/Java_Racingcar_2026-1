package racingcar;
import java.util.*;

public class Winner {
    List<Car> cars;

    public Winner(List<Car> cars) {
        this.cars = cars;
    }
    public List<String> findWinner() {
        int max = 0;
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMoveCount() > max) {
                max = car.getMoveCount();
                winners.clear();
                winners.add(car.getName());
            } else if (car.getMoveCount() == max) {
                winners.add(car.getName());
            }
        }
        return winners;
    }
}