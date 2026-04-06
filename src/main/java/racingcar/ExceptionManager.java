package racingcar;

public class ExceptionManager {
    public void CarNameExcept(String name) {
        if (name.isEmpty()) {throw new IllegalArgumentException("왜안적음");}
        if (name.length() > 5) {throw new IllegalArgumentException("이름5자초과됨");}
        if (name.contains(" ")) {throw new IllegalArgumentException("공백포함됨");}
    }
    public void NumberInputExcept(int i) {

    }
}
