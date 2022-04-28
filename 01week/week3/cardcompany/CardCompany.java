package week3.cardcompany;

import week3.singleton.Company;

public class CardCompany{

    private static final CardCompany instance = new CardCompany();
    private static int cardNumberForGeneration = 10000; // 변화하는 상태를 싱글톤 객체에 저장하는것은 부적합함.
    private CardCompany() {

    }

    public static CardCompany getInstance() {
        return instance;
    }

    public Card createCard() {
        return new Card(++cardNumberForGeneration);
    }
}
