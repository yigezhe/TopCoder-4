import java.util.*;

public class AdvertisingAgency
{
    public static void main(String[] args)
    {
        int[] requests = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
 100, 100, 100, 100, 100, 100, 100, 100, 100, 100
};
        System.out.println(numberOfRejections(requests));
    }

    public static int numberOfRejections(int[] requests)
    {
        Set<Integer> accepted = new HashSet<Integer>();
        int numberOfRejections = 0;
        for (int request : requests)
        {
            if(!accepted.add(request))
            {
                numberOfRejections++;
            }
        }

        return numberOfRejections;
    }
}
