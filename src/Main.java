import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        message("polnaja jopa  s noutom");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи размер массива");
        int size = scan.nextInt();
        int[] nums = new int[size];
        System.out.println("Введи массив");
        for (int i = 0;i < size;i++)
            nums[i] = scan.nextInt();
        for (int i = 0;i < size;i++)
            System.out.print(nums[i]+" ");

        int n = nums.length;
            for (int i = 0;i < n-1;i++)
                for (int j = 0;j < n-i-1;j++)
                    if (nums[j]<nums[j+1])
                    {
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
        System.out.println(" ");
        for (int i = 0;i < size;i++)
            System.out.print(nums[i]+" ");
    }
    static void message (String s){
        System.out.println(s);
        System.out.print("xxaxaxaxa");
    }


}
