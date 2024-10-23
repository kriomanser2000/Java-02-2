public class Array implements IMath
{
    private int[] nums;
    public Array(int[] numbers)
    {
        this.nums = numbers;
    }
    @Override
    public int Max()
    {
        int max = nums[0];
        for (int num : nums)
        {
            if (num > max)
            {
                max = num;
            }
        }
        return max;
    }
    @Override
    public int Min()
    {
        int min = nums[0];
        for (int num : nums)
        {
            if (num < min)
            {
                min = num;
            }
        }
        return min;
    }
    @Override
    public float Avg()
    {
        int sum = 0;
        for (int num : nums)
        {
            sum += num;
        }
        return (float) sum / nums.length;
    }
    public static void main(String[] args)
    {
        int[] nums = {4, 8, 15, 16, 23, 42};
        Array arr = new Array(nums);
        System.out.println("Max: " + arr.Max());
        System.out.println("Min: " + arr.Min());
        System.out.println("Avg: " + arr.Avg());
    }
}
