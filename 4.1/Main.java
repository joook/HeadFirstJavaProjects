class Main
{

public static void main(String[] args)
{
    Dog dogA = new Dog();
    Dog dogB = new Dog();
    Dog dogC = new Dog();

    String nameA = "Husky";
    String nameB = "Bulldog";
    String nameC = "Poodle";

    dogA.setSize(120);
    dogA.setName(nameA);

    dogB.setSize(80);
    dogB.setName(nameB);

    dogC.setSize(50);
    dogC.setName(nameC);

    dogA.bark();
    dogB.bark();
    dogC.bark();
}

}
