package week6.scheduler;

import java.util.Scanner;

public class SchedulerTest {


    public static void main(String[] args) {
        System.out.println("전화 상담 할당 방식을 선택 하세요.");
        System.out.println("R : 한명씩 차례로 할당.");
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P : 우선순위가 가장 높은 고객부터 할당.");
        Scanner scanner = new Scanner(System.in);
        Scheduler scheduler = null;
        String input = scanner.next();
        if (input.equals("R") || input.equals("r")) {
            scheduler = new RoundRobin();
        } else if (input.equals("L") || input.equals("l")) {
            scheduler = new LeastJob();
        } else if (input.equals("P") || input.equals("p")) {
            scheduler = new PriorityAllocation();
        } else {
            System.out.println("맞는 입력이 없습니다.");
        }
        try {
            scheduler.getNextCall();
            scheduler.sendCallToAgent();
        } catch (NullPointerException npe) {
            return;
        }

    }

}
