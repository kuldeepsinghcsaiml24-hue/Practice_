import java.util.*;
public class InsertAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int element = sc.nextInt();
        int[] brr = new int[n+1];

        for (int i = 0; i < n; i++) {
            brr[i] = arr[i];
        }
        brr[n] = element;

        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
