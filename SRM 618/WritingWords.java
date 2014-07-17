public class WritingWords
{
    public static void main(String[] args)
    {
        System.out.println(write("TOPCODER"));
    }

    public static int write(String word)
    {
        int sum = 0;
        for (char c : word.toCharArray())
        {
            int ascii = (int) c;
            sum += ascii - 64;
        }

        return sum;
    }
}
