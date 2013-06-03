public class SpeedRadarTester
{
    public static void main (String[] args)
    {
        SpeedRadar sr = new SpeedRadar();
        int[] readings0 = {45,40,50} ;
        int[] readings1 = {42,43,44,45,46,47,48,49,50,51} ;
        int[] readings2 = {42,46,48,50,52} ;
        int[] readings3 = {25,45,45,43,24,9,51,55,60,34,61,23,40,40,47,49,33,23,47,54,54} ;
        System.out.println(sr.averageSpeed(1, 50, readings0));
        System.out.println(sr.averageSpeed(1, 50, readings1));
        System.out.println(sr.averageSpeed(1, 50, readings2));
        System.out.println(sr.averageSpeed(20, 60, readings3));
    }
}
