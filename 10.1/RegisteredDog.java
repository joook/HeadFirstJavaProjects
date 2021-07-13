final class RegisteredDog 
{

private static int m_Id = 0;
private int m_SelfId;
private String m_Name;

public static int getMaxId() { return m_Id; }

private static int createId()
{
    m_Id++;
    return m_Id;
}

public RegisteredDog(final String name)
{
    super();
    m_Name = name;
    m_SelfId = createId();
}

public RegisteredDog()
{
    this("Unnamed");
}

public int getSelfId() { return m_SelfId; }
public String getName() { return m_Name; }
public void setName(final String name) { m_Name = name; }

}
