package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.*;

public class Application {
    public static void main(String[] args) {



        List<Car> cars = new ArrayList<>();
        for (String name : a.split(",")) {
            if (name.isEmpty()) {throw new IllegalArgumentException("왜안적음");}
            if (name.length() > 5) {throw new IllegalArgumentException("이름5자초과됨");}
            if (name.contains(" ")) {throw new IllegalArgumentException("공백포함됨");}
            cars.add(new Car(name));
        }
        Set<String> dupCheck = new HashSet<>();
        for (Car c : cars){dupCheck.add(c.getName());}
        if (dupCheck.size() != cars.size()) {throw new IllegalArgumentException("중복이름있음");}


        int n;
        try {
            n = in.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException("0번이하");
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("숫자안적음");
        }

        Gaming g = new Gaming(cars, n);
        g.start();

        Winner w = new Winner(cars);
        System.out.println("최종 우승자 : " + String.join(", ", w.findWinner()));
    }
}
