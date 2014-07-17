public class SpeedRadar
{
    public double averageSpeed(int minLimit, int maxLimit, int[] readings)
    {
        int infringements = 0;      // number of infringments
        double percentage;          // percentage of readings which are infringements
        int sum = 0;
        double average = 0.0;

        for (int reading : readings)
        {
            if (reading < minLimit || reading > maxLimit)
                infringements++;
            sum += reading;
        }

        percentage = (double)(infringements) / readings.length;     // have to cast it as a double to get a double

        if (percentage <= 0.1)
            average = (double)(sum) / readings.length;

        return average;
    }
}
