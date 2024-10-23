import java.util.Arrays;

public class Array1 implements ISort
{
    private int[] data;
    public Array1(int[] data)
    {
        this.data = data;
    }
    @Override
    public void SortAsc()
    {
        Arrays.sort(data);
        System.out.println("Array sorted in ascending order: " + Arrays.toString(data));
    }
    @Override
    public void SortDesc()
    {
        Arrays.sort(data);
        for (int i = 0; i < data.length / 2; i++)
        {
            int temp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = temp;
        }
        System.out.println("Array sorted in descending order: " + Arrays.toString(data));
    }
    public void printArray()
    {
        System.out.println("Current Array: " + Arrays.toString(data));
    }
}
