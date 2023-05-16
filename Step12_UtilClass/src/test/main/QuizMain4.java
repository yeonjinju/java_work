package test.main;

import java.lang.Math;
import java.util.TreeSet;
import java.util.Scanner;

public class QuizMain4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("로또를 몇 개 구매하시겠습니까?");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            TreeSet ts = new TreeSet();
            for (int k = 0; ts.size() < 6; k++) {
                int num = (int) (Math.random() * 45) + 1;
                ts.add(num);
            }
            System.out.println(ts);
        }
    }
}