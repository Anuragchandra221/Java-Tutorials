import java.util.*;
class SumAndAvg{
    public static void main(String[] args){
        int[] arr = new int[5];
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.printf("Enter number %d: ", i);
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        float avg = sum/5;
        System.out.printf("Sum is %f and Average is %f", sum, avg);
    }
}