package week6.buysell;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        Sell seller = customer;

        buyer.buy();
        seller.sell();
        buyer.order();
        seller.order();
        customer.order();
    }

}
