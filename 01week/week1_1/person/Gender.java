package week1_1.person;

public enum Gender {
    여성(2), 남성(3);

    Object value;

    Gender(int value) {
        this.value = value;
    }
}
