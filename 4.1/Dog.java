class Dog
{

private int m_Size;
private String m_Name;

public int getSize()
{
    return m_Size;
}

public String getName()
{
    return m_Name;
}

public void setSize(int size)
{
    m_Size = size;
}

public void setName(String name)
{
    m_Name = name;
}

public void bark()
{
    if (getSize() > 100)
    {
        System.out.println("Wooof! Wooof!");
    }
    else if ((getSize() <= 100) && (getSize() > 50))
    {
        System.out.println("Ruff! Ruff!");
    }
    else
    {
        System.out.println("Yip! Yip!");
    }
}

}
