package week6.scheduler;

public class PriorityAllocation implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("고객등급이 높은 전화를 먼저 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무능력이 가장 좋은 상담원에게 배정합니다.");

    }
}
