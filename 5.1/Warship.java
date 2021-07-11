class Warship
{

private int[] m_Position = new int[3];
private int m_HitCount = 0;
private String m_State = "ALIVE";

public String getState() { return m_State; }

public void setPosition(int warshipHead)
{
    m_Position[0] = warshipHead;
    m_Position[1] = warshipHead+1;
    m_Position[2] = warshipHead+2;
}

public void setState(String state) { m_State = state; }

private boolean scan(int position)
{
    for (int i = 0; i < 3; i++)
    {
        if (m_Position[i] == position)
        {
            m_Position[i] = -1;
            m_HitCount++;
            if (m_HitCount == 3)
            {
                setState("KILLED");
            }
            else
            {
                // keep alive
            }

            return true;
        }
        else
        {
            // go on
        }
    }
    return false;
}

public String checkEnemyFirePosition(int position)
{
    String result;
    if (scan(position))
    {
        result = "HIT";
    }
    else
    {
        result = "MISS";
    }
    return result;
}

}
