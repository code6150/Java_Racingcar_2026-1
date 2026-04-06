package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String a = in.nextLine();
        List<Car> cars = new ArrayList<>();
        for (String name : a.split(",")) {

            cars.add(new Car(name));
        }
        Set<String> dupCheck = new HashSet<>();
        for (Car c : cars){dupCheck.add(c.name);}

        if (dupCheck.size() != cars.size()) {throw new IllegalArgumentException("중복이름있음");}

        System.out.println("시도할 회수는 몇회인가요?");
        int n;
        try {
            n = in.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException("0번이하");
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("숫자안적음");
        }

        System.out.printf("%n실행 결과%n");
        for (int i=n;i>0;i--) {
            for (Car car : cars) {
                int ran = Randoms.pickNumberInRange(0,9);
                final int movingNumber = 4;
                if (ran >= movingNumber) {car.move();}
                String howMove = "-".repeat(car.getMoveCount());
                System.out.printf("%s : %s%n", car.name,howMove);
            }
            System.out.println(" "); //한칸 띄기용
        }

        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
