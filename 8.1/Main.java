import java.util.ArrayList;
import java.util.LinkedList;

class Main
{

public static void main(String[] args)
{
    LinkedList<Pet> petList = new LinkedList<Pet>();
    petList.add(new Cat());
    petList.add(new Dog());

    for (Pet pet : petList)
    {
        pet.playWithPeople();
    }

    ArrayList<Animal> animalList = new ArrayList<Animal>();
    animalList.add(new Cat());
    animalList.add(new Dog());
    animalList.add(new Lion());
    animalList.add(new Wolf());

    for (Animal animal : animalList)
    {
        animal.makeNoise();
        animal.sleep();
    }
}

}
