package week6.scheduler;

public class LeastJob implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("들어오는 순서대로 전화를 연결합니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("가장 대기열이 짧거나 상담을 하지않는 상담원에게 우선 배정합니다.");
    }
}
