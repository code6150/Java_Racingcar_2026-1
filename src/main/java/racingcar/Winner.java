package racingcar;
import java.util.*;

public class Winner {
    List<Car> cars;

    public Winner(List<Car> cars) {
        this.cars = cars;
    }

    public List<String> ChooseWinner() {
        int max = 0;
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMoveCount() > max) {
                max = car.getMoveCount();
                winners.clear();
                winners.add(car.name);
            } else if (car.getMoveCount() == max) {
                winners.add(car.name);
            }
        }
        return winners;
    }
}