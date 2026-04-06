package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //부릉부릉
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String a = in.nextLine();
        List<Car> cars = new ArrayList<>();
        for (String name : a.split(",")) {
            if (name.isEmpty()) {throw new IllegalArgumentException("왜안적음");}
            if (name.length() > 5) {throw new IllegalArgumentException("이름5자초과됨");}
            if (name.contains(" ")) {throw new IllegalArgumentException("공백포함됨");}
            cars.add(new Car(name));
        }
        Set<String> dupCheck = new HashSet<>();
        for (Car c : cars){dupCheck.add(c.name);}

        if (dupCheck.size() != cars.size()) {throw new IllegalArgumentException("중복이름있음");}

        //끼이익쾅
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
                if (ran >= 4) {car.move();}
                String howMove = "-".repeat(car.getMoveCount());
                System.out.printf("%s : %s%n", car.name,howMove);
            }
            System.out.println(" "); //한칸 띄기용
        }

        //띠리리리리리링
        int max = 0;
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMoveCount() > max){
                max = car.getMoveCount();
                winners.clear();
                winners.add(car.name);
            } else if (car.getMoveCount() == max) {
                winners.add(car.name);
            }
        }

        //조아요 조아요
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
