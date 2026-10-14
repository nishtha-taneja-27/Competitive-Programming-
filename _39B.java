import java.util.*;
public class _39B  {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int find  = 1;
        ArrayList<Integer> Result = new ArrayList<>();
        for(int i =0; i<n; i++){
            if(arr[i] == find){
                count++;
                find++;
                int num = 2001+i;
                Result.add(num);
            }
            else{
                continue;
            }
        }
        
        System.out.println(count);
        for(int i = 0; i < Result.size(); i++){
            System.out.print(Result.get(i)+ " ");
        }
        sc.close();
    
    }  
}
