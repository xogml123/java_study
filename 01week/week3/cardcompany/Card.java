package week3.cardcompany;

public class Card {

    private int cardNumber;
    private static int cardNumberForGeneration = 10000; // 변화하는 상태를 싱글톤 객체에 저장하는것은 부적합함.

    public Card() {
        ++cardNumberForGeneration;
        this.cardNumber = cardNumberForGeneration;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
