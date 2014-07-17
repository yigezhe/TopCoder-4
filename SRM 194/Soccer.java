public class Soccer
{
    public static void main(String[] args)
    {
        int[] wins = {1, 4, 3, 0, 0};
        int[] ties = {3, 1, 5, 3, 1};
        int maxPoints = maxPoints(wins, ties);
        System.out.println(maxPoints);
    }

    public static int maxPoints(int[] wins, int[] ties)
    {
        int maxPoints = 0;
        for (int i = 0; i < wins.length; i++)
        {
            int currentPoints = (wins[i] * 3) + ties[i];
            if (currentPoints > maxPoints)
            {
                maxPoints = currentPoints;
            }
        }

        return maxPoints;
    }
}
