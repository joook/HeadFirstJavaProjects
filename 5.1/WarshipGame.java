class WarshipGame
{

private InputHelper m_InputHelper;
private Warship m_Warship;
private int m_SeaSpace;

public void run()
{
    // create a InputHelper
    m_InputHelper = new InputHelper();
    // create a Warship
    m_Warship = new Warship();
    // create a sea space
    m_SeaSpace = 20;
    // put the Warship into the sea space
    int headPosition = (int) (Math.random() * (m_SeaSpace-2));
    m_Warship.setPosition(headPosition);

    // while Warship state is not KILLED, do following things:
    // InputHelper ask for user fire position
    // Warship checkEnemyFirePosition and return state
    while (m_Warship.getState().equals("ALIVE"))
    {
        String firePositionString = m_InputHelper.getInput("Enter your fire position: ");
        int firePosition = Integer.parseInt(firePositionString);
        String result = m_Warship.checkEnemyFirePosition(firePosition);
        System.out.println("You fired at "+firePosition+" , and "+result);
        System.out.println("The warship is "+m_Warship.getState());
        System.out.println("");
    }
    
    // InputHelper print input statistics
    System.out.println("You fired "+m_InputHelper.getInputCount()+" times in total.");
}

}
