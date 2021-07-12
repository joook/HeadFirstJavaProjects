abstract class Animal
{

private String m_Name;

public Animal()
{
    this("unknown animal");
}

public Animal(String name)
{
    m_Name = name;
}

public String getName() { return m_Name; }
public void setName(String name) { m_Name = name; }

public void sleep()
{
    System.out.println("Sleeping...");
}

public abstract void makeNoise();

}
