package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Gaming {
    private final int n;
    private final List<Car> cars;
    public Gaming(List<Car> cars, int n){
        this.cars = cars;
        this.n = n;
    }

    public void start() {
        System.out.printf("%n실행 결과%n");
        for (int i=n;i>0;i--) {
            for (Car car : cars) {
                int ran = Randoms.pickNumberInRange(0,9);
                final int movingNumber = 4;
                if (ran >= movingNumber) {car.move();}
                String howMove = "-".repeat(car.getMoveCount());
                System.out.printf("%s : %s%n", car.getName(),howMove);
            }
            System.out.println(" "); //한칸 띄기용
        }
    }
}
