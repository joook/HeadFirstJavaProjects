import java.util.ArrayList;

final class NumberHolder
{

private ArrayList<Float> m_NumberList = new ArrayList<Float>();

public NumberHolder() {}

public Integer getSize() { return m_NumberList.size(); }

public float getNumber(int pos) { return m_NumberList.get(pos); }
public void addNumber(float number) { m_NumberList.add(number); }
public void removeNumber(float number) { m_NumberList.remove(number); }

}
