import java.util.Arrays;

public class ArrayMethods
{
    private int[] values;
    private int[] nums = new int[]{1,4,9,16,25};
    public ArrayMethods(int[] initialValues)
    {
        this.values = initialValues;
    }
    public void printArray()
    {
        System.out.println(Arrays.toString(this.values));
    }
    public void swapFirstAndLast()
    {

    }
    public void shiftRight()
    {
        int temp = this.nums[this.nums.length-1];
        for(int i = this.nums.length-1;i>0;i--){
            this.nums[i] = this.nums[i-1];

        }
        this.nums[0] = temp;
    }


    public static void main( String[] args )
    {
        int[] testValues = new int[]{ 3, 5, 6, 1 /* add your own values */ };
        ArrayMethods tester = new ArrayMethods( testValues );
        tester.printArray();
        tester.swapFirstAndLast();
        tester.printArray();

        testValues = new int[]{ 1, 6, 3, 9, 5, 6 /* add your own values */ };
        tester = new ArrayMethods(testValues);
        tester.printArray();
        tester.shiftRight();
        tester.printArray();


    }
}
