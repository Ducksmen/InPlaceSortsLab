public class InPlaceSorts
{
    public static void insertionSort(int[] list1)
    {
        boolean t = true;
        while(t)
        {
            for(int i=0;i<list1.length;i++)
            {

            }
        }
    }

    public static void selectionSort(double[] list1)
    {
        int pos = 0;
        double cMin = 0;
        for(int i=0;i<list1.length;i++)
        {
            pos = i;
            cMin = list1[i];
            for(int j =0;j<list1.length;j++)
            {
                if (list1[i] < cMin)
                {
                    pos = j;
                    cMin = list1[j];
                }
            }
            list1[pos] = list1[i];
            list1[i] = cMin;
        }
    }

    public static void bubbleSort(String[] list1)
    {

    }
}
