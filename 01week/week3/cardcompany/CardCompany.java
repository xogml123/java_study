package week3.cardcompany;

import week3.singleton.Company;

public class CardCompany{

    private static final CardCompany instance = new CardCompany();

    private CardCompany() {
    }

    public static CardCompany getInstance() {
        return instance;
    }

    public Card createCard() {
        return new Card();
    }
}
