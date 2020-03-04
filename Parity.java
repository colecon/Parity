//Cole Constantino | Sort Array by Parity II
import java.util.*;
public class Parity{
  public static int[] sortArrayByParityII(int[] A) {
    //place even in next even spot, iterate
    //place odd in next odd spot, iterate
    int[] arr = new int[A.length];
    int evenIndex = 0;
    int oddIndex = 1;
    int count = 0;
    while(count < A.length){
      if(A[count] % 2 == 0){
        arr[evenIndex] = A[count]; 
        evenIndex+=2;
      }
      else{
        arr[oddIndex] = A[count]; 
        oddIndex+=2;   
      }
      count++;
    }
    return arr;
  }
  
  public static void main(String[] args){
    int[] a = {4,2,5,7};
    System.out.println(Arrays.toString(sortArrayByParityII(a)));
  }
}