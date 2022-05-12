package week4.purchase;

public class GoldCustomer extends Customer {

    public GoldCustomer(Integer id, String name) {
        super(id, name);
        memberShip = MemberShip.GOLD;
        discountRate = 0.1;
        accumulationRate = 0.02;
    }
}
