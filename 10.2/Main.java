final class Main
{

public static void print(Float a)
{
    String s = String.format("%,9.2f", a);
    System.out.println(s);
}

public static void print(final NumberHolder a)
{
    for (int i = 0; i < a.getSize(); i++)
    {
        print(a.getNumber(i));
    }
}

public static void main(String[] args)
{
    NumberHolder a = new NumberHolder();
    a.addNumber(10000.5f);
    a.addNumber(20000.6f);
    a.addNumber(30000);
    a.removeNumber(20000.6f);
    print(a);
}

}
