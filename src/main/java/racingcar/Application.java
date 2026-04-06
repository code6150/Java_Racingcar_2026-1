package racingcar;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        InputView input = new InputView();
        InputValidator iv = new InputValidator();

        List<Car> cars = iv.CarNamesValidator(input.inputCarName());
        int n = iv.IntegerValidator(input.inputRepeatN());


        Gaming g = new Gaming(cars, n);
        g.start();

        Winner w = new Winner(cars);
        System.out.println("최종 우승자 : " + String.join(", ", w.findWinner()));
    }
}
