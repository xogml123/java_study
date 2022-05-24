package week6.scheduler;

public class RoundRobin implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("들어오는 순서대로 전화를 연결합니다.");

    }

    @Override
    public void sendCallToAgent() {
        System.out.println("모든 상담원이 같은 상담건수를 담당하도록 배정합니다.");

    }
}
