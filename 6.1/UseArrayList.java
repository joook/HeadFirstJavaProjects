import java.util.ArrayList;

class UseArrayList
{

public static void printArrayList(ArrayList<String> list)
{
    System.out.println("The list contains: ");
    for (String item : list)
    {
        System.out.println(item);
    }

    System.out.println("The size of the list is: "+list.size());
}

public static void main(String[] args)
{
    ArrayList<String> list = new ArrayList<String>();
    list.add("ab");
    list.add("cd");
    list.add("ef");
    list.remove("cd");
    printArrayList(list);
}

}

