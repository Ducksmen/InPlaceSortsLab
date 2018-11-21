import java.util.Arrays;

public class Runner
{
    public static void main(String[] args)
    {
        InPlaceSorts list1 = new InPlaceSorts();
        long time = System.nanoTime();
        String[] arrayStr = list1.genStrings(10);
        list1.bubbleSort(arrayStr);
        System.out.println("Bubble Sorting: " + (System.nanoTime()-time) + " Milliseconds");
        System.out.println(Arrays.toString(arrayStr));
        time = System.nanoTime();
        int[] arrayInt = list1.genInts(10);
        list1.insertionSort(arrayInt);
        System.out.println("Insertion Sorting: " + (System.nanoTime()-time)  + " Milliseconds");
        System.out.println(Arrays.toString(arrayInt));
        time = System.nanoTime();
        double[] arrayDouble = list1.genDoubles(10);
        list1.selectionSort(arrayDouble);
        System.out.println("Selection Sorting: " + (System.nanoTime()-time)  + " Milliseconds");
        System.out.println(Arrays.toString(arrayDouble));
    }
}
