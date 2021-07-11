class WarshipTest
{

public static void main(String[] args)
{
    Warship a = new Warship();
    a.setPosition(4);

    int[] fireSequence = {5, 4, 3, 6, 5};
    String result;
    for (int i = 0; i < fireSequence.length; i++)
    {
        result = a.checkEnemyFirePosition(fireSequence[i]);
        System.out.println("Fire at "+fireSequence[i]+" result: "+result);
        System.out.println("The state of the warship: "+a.getState());
        System.out.println("");
    }
}

}
