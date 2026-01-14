import java.util.*;
public class InsertAtIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] brr = new int[n+1];
        int index = sc.nextInt();
        int element = sc.nextInt();
        for(int i=0;i<n;i++){
            brr[i]=arr[i];
        }
        brr[index] = element;
        for(int i= index;i<n;i++){
            brr[i+1] = arr[i];
        }
        System.out.println(Arrays.toString(brr));
    }
}
