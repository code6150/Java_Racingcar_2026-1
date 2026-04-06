package racingcar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputValidator {
    public void CarNamesValidator(String name) {
        List<Car> cars = new ArrayList<>();
        for (String a : name.split(",")) {
            CarNameValidator(a);
            cars.add(new Car(a));
        }
        Set<String> dupCheck = new HashSet<>();
        for (Car c : cars){dupCheck.add(c.getName());}
        if (dupCheck.size() != cars.size()) {throw new IllegalArgumentException("중복이름있음");}
    }

    private void CarNameValidator(String name) {
        if (name.isEmpty()) {throw new IllegalArgumentException("왜안적음");}
        if (name.length() > 5) {throw new IllegalArgumentException("이름5자초과됨");}
        if (name.contains(" ")) {throw new IllegalArgumentException("공백포함됨");}
    }

    public void IntegerValidator(String n) {
        int count;
        try {count = Integer.parseInt(n);}
        catch (NumberFormatException e) {throw new IllegalArgumentException("숫자안적음");}

        if (count <= 0) {throw new IllegalArgumentException("0번이하");}
    }
}
