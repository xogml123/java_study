package week4.purchase;

import week4.customer.Customer;
import week4.customer.VIPCustomer;

public class CustomerTest {
    public static void main(String[] args) {

        week4.customer.Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        week4.customer.VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
