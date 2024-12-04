package Lektion1;

import java.util.ArrayList;
import java.util.*;

public class Greedy {
  public static void main(String[] args){
      int coins[]={50,10,5,2,1};
      int coins2[]={11,7,1};
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
    greedy(coins2,n);

  }
    public  static void greedy(int[] array,int n){
      int a=0;
      int i =0;
      while(i<array.length){
          if(array[i]<=n){
              a=(int) n/array[i];
              n-=a*array[i];
              System.out.println(a+" stück->"+array[i]);
          }
          i++;
      }
  }

}
