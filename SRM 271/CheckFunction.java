import java.util.*;

public class CheckFunction
{
    private Map<Character, Integer> decypher;

    public CheckFunction()
    {
        this.decypher = new HashMap<Character, Integer>(); 
    }

    public void populate()
    {
        decypher.put('0', 6);
        decypher.put('1', 2);
        decypher.put('2', 5);
        decypher.put('3', 5);
        decypher.put('4', 4);
        decypher.put('5', 5);
        decypher.put('6', 6);
        decypher.put('7', 3);
        decypher.put('8', 7);
        decypher.put('9', 6);
    }

    public int newFunction(String code)
    {
        this.populate();
        int sum = 0;
        for (char c : code.toCharArray())
        {
            if (decypher.containsKey(c))
            {
                sum += decypher.get(c); 
            }
        }

        return sum;
    }
}
