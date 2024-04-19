import java.io.Console;
import java.util.Scanner;

public class Calculator {
    /*
        JavaSE 프로그램의 기본 골격
        main 메서드 : 프로젝트의 시작점 (진입점)
        메인 클래스부터 프로그램이 시작된다.
        함수 : 기능(function) / 메서드 : 동작(method)
        메서드 : 동작을 처리하는 함수 (function)

        JavaEE 프로그램은 main이 아니라 service로 시작한다.
     */
    public static void main(String[] args) {
        int a, b, sum;

        a = 1;
        b = 1;
        sum = a + b;
        System.out.println(sum);
    }
}
