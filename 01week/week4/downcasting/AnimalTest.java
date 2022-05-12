package week4.downcasting;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);

    }

    private void testDownCasting(ArrayList<Animal> animalList) {
        for (Animal animal : animalList) {
            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.behavior();
            }
            else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.behavior();
            }
            else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.behavior();
            }
        }
    }
}
