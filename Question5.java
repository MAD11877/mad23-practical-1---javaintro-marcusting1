import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Question5
  
{
  public static void main(String args[]) { 
    double highest = Math.pow(-999999,999999);
    
    ArrayList<Integer> intList = new ArrayList<Integer>();
    ArrayList<Integer> freqList = new ArrayList<Integer>();

    Scanner in = new Scanner(System.in);
    int num = in.nextInt();

    for (int i = num; i >= 1; i--){
      Scanner in1 = new Scanner(System.in);
      int integers = in1.nextInt();
      intList.add(integers);
    }

    //System.out.println(intList.size());

    for (int j = 0 ; j< intList.size(); j++){
      num = intList.get(j);
      int count = 0;
      for (int k = 0; k< intList.size(); k++){
        //count = 0;
        int val = intList.get(k);
        if (val==num){
          count++;
        }
      }
      freqList.add(count);
    }
    for (int l = 0 ; l < freqList.size(); l++){
      if (freqList.get(l) > highest){
        highest = freqList.get(l);
      }
    }

    int mode = 0;
    int newhighest = (int)highest;
    
    for (int m = 0 ; m < freqList.size(); m++){
      if (newhighest == freqList.get(m)){
        mode = intList.get(m);
      }
    }
  System.out.println(mode);
  } 
}
