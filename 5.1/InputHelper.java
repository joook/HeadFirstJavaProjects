import java.io.*;

class InputHelper
{

private int m_InputCount = 0;

public int getInputCount() { return m_InputCount; }

public String getInput(String inputHint)
{
    String inputLine = null;

    System.out.println(inputHint);
    try
    {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        inputLine = is.readLine();
        m_InputCount++;
    }
    catch (IOException e)
    {
        System.out.println("IOException: "+e);
    }

    return inputLine;
}

}
