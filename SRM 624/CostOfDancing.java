import java.util.*;

public class CostOfDancing
{
    public static void main(String[] args)
    {
        int[] danceCost = {1, 5, 3, 4};
        System.out.println(minimum(2, danceCost));
    }

    public static int minimum(int k, int[] danceCost)
    {
        Arrays.sort(danceCost);
        int min = 0;
        for (int i = 0; i < k; i++)
        {
            min += danceCost[i];
        }

        return min;
    }
}
