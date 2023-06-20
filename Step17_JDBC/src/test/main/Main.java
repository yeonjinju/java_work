package test.main;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();

        numbers.add(10.1);
        numbers.add(10.2);
        numbers.add(10.3);

        // 저장된 숫자 출력
        for (Double number : numbers) {
            System.out.println(number);
        }
    }
}