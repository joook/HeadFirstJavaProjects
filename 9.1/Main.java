import java.util.ArrayList;

class Main
{

public static void main(String[] args)
{
    ArrayList<Animal> animalList = new ArrayList<Animal>();
    animalList.add(new Cat());
    animalList.add(new Dog());
    animalList.add(new Lion());

    for (Animal animal : animalList)
    {
        System.out.println("This is a(n) " + animal.getName() + ".");
        animal.makeNoise();
        animal.sleep();
    }
}

}
