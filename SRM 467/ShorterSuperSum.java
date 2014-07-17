public class ShorterSuperSum
{
    private static int[][] table = new int[15][15];

    public static void main(String[] args)
    {
        System.out.println(calculate(4, 10));
    }

    private static void fillTable()
    {
        for (int n = 0; n < 15; n++)
        {
            table[0][n] = n;
        }

        for (int n = 1; n < 15; n++)
        {
            for (int k = 1; k < 15; k++)
            {
                table[k][n] = table[k-1][n] + table[k][n-1];
            }
        }
    }

    public static int calculate(int k, int n)
    {
        fillTable();

        return table[k][n];
    }
}
