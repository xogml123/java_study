package week1_1.opeartor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operator {
    private Float a;
    private Float b;

    public Operator() {
    }

    public Operator(Float a, Float b) {
        this.a = a;
        this.b = b;
    }

    public Float getA() {
        return a;
    }

    public void setA(Float a) {
        this.a = a;
    }

    public Float getB() {
        return b;
    }

    public void setB(Float b) {
        this.b = b;
    }

    public Double plus() {
        return (double)(a + b);
    }

    public Double minus() {
        return (double)(a - b);
    }

    public Double multiply() {
        return (double)(a * b);
    }

    public Double divide() {
        if  (b == 0.0) {
            throw new ZeroDivisionException("나누는 수가 0입니다.");
        }
        return (double)(a / b);
    }

//    public Operator() {
//
//        String c;
//
//        System.out.println("두 수를 입력하시오");
//        Scanner sc = new Scanner(System.in);
//
//
//
//        try {
//
//            a = sc.nextInt();
//            b = sc.nextInt();
//
//            System.out.println("사칙 연산을 입력 + - * /");
//
//            c = sc.next();
//
//
//            switch (c) {
//                case "+":
//                    System.out.println(a + b);
//                    break;
//                case "-":
//                    System.out.println(a - b);
//                    break;
//                case "*":
//                    System.out.println(a * b);
//                    break;
//                case "/":
//                    System.out.println(a / b);
//                    break;
//                default:
//                    System.out.println("실페 : 잘못된 입력문자");
//                    break;
//            }
//
//        } catch (InputMismatchException e) {
//
//            System.out.println("알맞은 값을 입력하시오. 처음부터 다시.");
//
//        }
//
//    }
}
