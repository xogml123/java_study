package week4.purchase;


public class VIPCustomer extends Customer {

    public VIPCustomer(Integer id, String name) {
        super(id, name);
        memberShip = MemberShip.VIP;
        discountRate = 0.1;
        accumulationRate = 0.05;
    }

}
