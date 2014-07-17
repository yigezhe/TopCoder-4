public class DiagonalDisproportion
{
    public static void main(String[] args)
    {
        String[] matrix = {"9000","0120","0000","9000"};
        System.out.println(getDisproportion(matrix));
    }

    public static int getDisproportion(String[] matrix)
    {
        int mainDiagonalSum = 0;
        int collateralDiagonalSum = 0;
        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--)
        {
            mainDiagonalSum += Character.getNumericValue(matrix[i].charAt(i));
            collateralDiagonalSum += Character.getNumericValue(matrix[i].charAt(j));
        }

        return mainDiagonalSum - collateralDiagonalSum;
    }
}
