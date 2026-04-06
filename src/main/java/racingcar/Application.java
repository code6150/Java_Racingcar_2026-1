package racingcar;
import java.util.*;

public class Application {
    public static void main(String[] args) {



        Gaming g = new Gaming(cars, n);
        g.start();

        Winner w = new Winner(cars);
        System.out.println("최종 우승자 : " + String.join(", ", w.findWinner()));
    }
}
