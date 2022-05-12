package week4.purchase;

import java.util.ArrayList;

public class CustomerTest3 {
    public static void main(String[] args) {

        final ArrayList<Customer> customers = new ArrayList<>();

        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 0;
        customers.add(customerLee);

        Customer customerShin = new Customer(10020, "신사임당");
        customerShin.bonusPoint = 0;
        customers.add(customerShin);

        GoldCustomer customerHong = new GoldCustomer(10030, "홍길동");
        customerHong.bonusPoint = 0;
        customers.add(customerHong);

        GoldCustomer customerLeeYeol = new GoldCustomer(10040, "이율곡");
        customerLeeYeol.bonusPoint = 0;
        customers.add(customerLeeYeol);

        VIPCustomer customerKim = new VIPCustomer(10050, "김유신");
        customerKim.bonusPoint = 0;
        customers.add(customerKim);

        System.out.println("====== 고객정보 출력 ======");
        for (Customer customer : customers) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("====== 할인율과 보너스 포인트 계산 ======");
        for (Customer customer : customers) {
            System.out.println(customer.getName() + " 님이 " + customer.calcPrice(10000) + "원 지불하셨습니다.");
            System.out.println(customer.getName() + "님의 현재 포인트는 " + customer.bonusPoint + "점입니다.");
        }

    }
}
