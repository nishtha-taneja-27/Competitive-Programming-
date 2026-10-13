import java.util.*;
public class _39D {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        for(int i =0; i< 3; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i =0; i< 3; i++){
            arr2[i] = sc.nextInt();
        }
        int flag = 0;
        for(int i = 0; i<3; i++){
            if(arr1[i]==arr2[i]){
            flag=1;
            break;}
        }
        if(flag == 1)System.out.print("YES");
        else System.out.print("NO"); 
        sc.close();
    }
}
