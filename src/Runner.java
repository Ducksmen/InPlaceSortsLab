public class Runner
{
    public static void main(String[] args)
    {
        double[] y = new double[10];
        for(int i=0;i<y.length;i++)
        {
            y[i] = Math.random()*10;
        }
        String str = "";
        for(int i=0;i<y.length;i++)
        {
            str += (int)(y[i]) + " ";
        }
        System.out.println(str);
        InPlaceSorts.selectionSort(y);

        str = "";
        for(int i=0;i<y.length;i++)
        {
            str += (int)(y[i]) + " ";
        }
        System.out.println(str);

    }
}
