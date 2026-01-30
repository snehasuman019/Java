/* /
import java.util.ArrayList;

public class ResourceConsumption {
  public static void main(String[] args) {
    int[] arr={17,2,10,5,12,6,21};
    ArrayList<Integer> arr1=new ArrayList<>();
    for(int x:arr) arr1.add(x);
    int total=0;
    while(!arr1.isEmpty()){
      int min=0;
      for(int i=1;i<arr1.size();i++){
        if(arr1.get(i)<arr1.get(min)){
          min=i;
        }
      }
      total+=arr1.get(min);
      if(min+1<arr1.size()){
        arr1.remove(min+1);
      }
      if(min-1>=0){
        arr1.remove(min-1);
        min--;
      }
      arr1.remove(min);
    }
    System.out.println(total);
  }
}
// 4->
// wap given an array of n integer each integer represent resource consumption for a task
// follow operation until we reach empty array
// select lowest value from array and remove it and it's adjacent value(adjacent value is not calculated as consumption)
// implement a function that calculates total consumption of the task
// ex-17,2,10,5,12,6,21
// with 2 -> 2 ,17, 10 will be removed (both side task will be removed if possible)
// next smallest->5-> 5 and 12 will be removed
// next smallest->6-> 6 and 21 will be removed
// and output will be = 2+5+6=13

*/

import java.util.*;
public class ResourceConsumption{
  static class Task{
    int val;
    int idx;
    Task(int v, int i){
      this.idx = i;
      this.val = v;
    }
  }
  static int minResource(int[] arr){
    int n = arr.length;

    int total = 0;
    PriorityQueue<Task> pq = new PriorityQueue<>(
        (a,b)->a.val!=b.val?a.val-b.val:a.idx-b.idx
    );
    for(int i=0;i<n;i++){
      pq.offer(new Task(arr[i],i));
    }
    for(Task i : pq){
      if(arr[i.idx]!=-1){
        total += i.val;
        arr[i.idx]=-1;
      
      if(i.idx+1<n){
        arr[i.idx+1]=-1;
      }
      if(i.idx-1>=0){
        arr[i.idx-1]=-1;
      }
    }
  }
    return total;
  }
  public static void main(String[] args){
    int[] arr = {4,3,2,1,5};
    // boolean[] removed = new boolean[arr.length]
    int total = minResource(arr);
    System.out.println(total);


  }
}