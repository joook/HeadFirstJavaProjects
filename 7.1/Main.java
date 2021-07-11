class Main
{

public static void main(String[] args)
{
    Animal[] animalList = new Animal[2];
    animalList[0] = new Cat();
    animalList[1] = new Dog();

    for (Animal animal : animalList)
    {
        animal.makeNoise();
        animal.sleep();
    }
}

}
