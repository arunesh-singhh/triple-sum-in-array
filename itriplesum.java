import java.util.Scanner;

public class itriplesum {
    public static int pairSum(int arr[], int x) {
        int count = 0;
    	for (int i = 0; i < arr.length -2; i++) {
            for (int j = i + 1; j < arr.length-1; j++) {
                for (int j2 = j + 1; j2 < arr.length; j2++) {
                    if (arr[i] + arr[j] + arr[j2] == x) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        Scanner sr = new Scanner(System.in);
        int n=sr.nextInt();
        int[] arr=new int[n];

        for (int i =0 ; i<n;i++){
            arr[i]=sr.nextInt();
        }
        int x =sr.nextInt();
        System.out.println(pairSum(arr,x));
        sr.close();
    }
}
