package week4.purchase;


public class Customer {

    protected Integer id;
    protected String name;
    public Integer bonusPoint;
    protected Double discountRate;
    protected Double accumulationRate;
    protected MemberShip memberShip = MemberShip.SILVER;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getBonusPoint() {
        return bonusPoint;
    }

    public Customer(Integer id, String name) {
        this.id = id;
        this.name = name;
        discountRate = 0.0;
        accumulationRate = 0.01;
    }

    public String showCustomerInfo() {
        return name+"님의 등급은 "+memberShip+"이며, 보너스 포인트는 "+ bonusPoint +"입니다";
    }

    public int calcPrice(int price) {
        bonusPoint += (int) ( accumulationRate * price);
        return (int)(price * (1.0 - discountRate));
    }
}
