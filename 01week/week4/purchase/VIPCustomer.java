package week4.purchase;


public class VIPCustomer extends Customer {

    @Override
    public String showCustomerInfo() {
        return name+"님의 등급은 "+memberShip+"이며, 보너스 포인트는 "+ bonusPoint +"입니다. 담당 상담원 번호는 12345입니다.";
    }

    public VIPCustomer(Integer id, String name) {
        super(id, name);
        memberShip = MemberShip.VIP;
        discountRate = 0.1;
        accumulationRate = 0.05;
    }

}
