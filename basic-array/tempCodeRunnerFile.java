import java.util.*;
class InsertAtBeginning {
    void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int element = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] brr = new int[n+1];
        brr[0] = element;

        for(int i=0;i<n;i++){
            brr[i+1] = arr[i];
        }
        for(int i=0;i< brr.length;i++){
            System.out.println(brr[i] + "");
        }
    }
}
