final class Main
{

public static void print(int a)
{
    System.out.println(a);
}

public static void print(final NumberHolder a)
{
    System.out.println(a.getNumber());
}

public static void plus(final NumberHolder a)
{
    a.selfPlus();
}

public static void main(String[] args)
{
    final NumberHolder a = new NumberHolder(100);
    print(a);
    Main.plus(a);
    Main.print(a);

    print(RegisteredDog.getMaxId());
    final RegisteredDog dogA = new RegisteredDog();
    final RegisteredDog dogB = new RegisteredDog("Mark");
    final RegisteredDog dogC = dogA;
    print(dogA.getSelfId());
    print(dogB.getSelfId());
    print(dogC.getSelfId());
}

}
