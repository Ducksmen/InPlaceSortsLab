import java.text.DecimalFormat;
import java.util.Random;

public class InPlaceSorts
{
    public int challengeFour(int[][] challenge4)
    {
        double median;
        int[]rowMediums = new int[9999];
        int[][]temp2d = new int[1000][1000];
        for(int i=0;i<1000;i++)
        {
            for(int j=0;j<1000;j++)
            {
                int n = 1000;
                for (int gap = n/2; gap > 0; gap /= 2)
                {
                    for (int k = gap; k < n; k += 1)
                    {
                        int temp = challenge4[i][k];
                        int l;
                        for (l = k; l >= gap && challenge4[i][l - gap] > temp; l -= gap) {
                            challenge4[j] = challenge4[l - gap];
                        }
                        challenge4[i][l] = temp;
                    }
                }
            }
        }
        for (int i=0;i<1000;i++)
        {
            median = ((double)challenge4[i][499] + (double)challenge4[i][500])/2;
            median = Math.floor(median);
            rowMediums[i] = (int)median;
        }
        for(int i=0;i<1000;i++)
        {
            int cMin = rowMediums[i];
            int x = i - 1;
            while(x>=0 && rowMediums[x] > cMin)
            {
                rowMediums[x+1] = rowMediums[x];
                for(int j=0;j<1000;j++)
                {
                    challenge4[i][x+1] = challenge4[i][x];
                }

                x--;
            }
            rowMediums[x+1] = cMin;
        }
        median = (double)rowMediums[rowMediums[4999]/2];
        return (int)median;
    }
    public static void insertionSort(int[] list1)
    {
        for(int i=0;i<list1.length;i++)
        {
            int cMin = list1[i];
            int x = i - 1;
            while(x>=0 && list1[x] > cMin)
            {
                list1[x+1] = list1[x];
                x--;
            }
            list1[x+1] = cMin;
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
        boolean swapping = true;
        String temp;
        int numSwaps = 0;
        while(swapping)
        {
            for (int i = 0; i < list1.length - 1; i++)
            {
                if (list1[i].compareTo(list1[i + 1]) > 0)
                {
                    temp = list1[i];
                    list1[i] = list1[i + 1];
                    list1[i + 1] = temp;
                    numSwaps++;
                }
            }
            if(numSwaps > 0)
            {
                numSwaps = 0;
            }
            else
            {
                if(numSwaps == 0)
                    swapping = false;
            }
        }
    }

    public int[] genInts(int n)
    {
        int[] list1 = new int[n];
        Random random = new Random();
        for(int i = 0; i < n; i++)
        {
            list1[i] = random.nextInt(10000);
        }
        return list1;
    }
    public int[][] genInts2(int n)
    {
        int[][] challengeFour = new int[n][n];
        Random random = new Random();
        for(int i = 0; i < n; i++)
        {
            for(int j=0;j<n;j++)
            {
                challengeFour[i][j] = random.nextInt(10000);
            }
        }
        return challengeFour;
    }

    public double[] genDoubles(int n)
    {
        double[] list1 = new double[n];
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.###");
        for(int i = 0; i < n; i++)
        {
            list1[i] = Double.valueOf(df.format((random.nextDouble() * 10)));
        }
        return list1;
    }

    public String[] genStrings(int n)
    {
        String[] list1 = new String[n];
        Random random = new Random();
        String atoz = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < n; i++)
        {
            byte[] array = new byte[random.nextInt(8) + 3];
            new Random().nextBytes(array);
            String generatedString = genRandom(atoz);
            list1[i] = generatedString;
        }
        return list1;
    }

    public String genRandom(String atoz)
    {
        Random random = new Random();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < 7; i ++)
        {
            int rand = random.nextInt(atoz.length());
            res.append(atoz.charAt(rand));
        }
        return res.toString();
    }
}
