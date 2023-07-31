import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      ArrayList<Integer> arr=new ArrayList<>();
      while(sc.hasNext()){
          arr.add(sc.nextInt());
      }
      Collections.sort(arr);
      int n=arr.size();
      if(m==0 || n==0) System.out.println("Minimum Difference is 0");
      if(n<m) System.out.println("Minimum Difference is -1");
      int min_diff=Integer.MAX_VALUE;
      for(int i=0;(i+m-1)<n;i++){
          int diff=arr.get(i+m-1)-arr.get(i);
          if(diff<min_diff) min_diff=diff;
        }
        System.out.println("Minimum Difference is "+min_diff);
      }
}