import java.util.*;
public class Selectsort{

    public static void prt(int [] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            }
            System.out.println("");
            }
    public static void main(String [] args){
    int []arr= { 2,5,8,9,76,3,2,4,56,6,67};
    int temp=arr[0];  // 0 1 5  6
    int swap=0;  // 2
    for(int i=0;i<arr.length;i++){
        temp=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[temp]>arr[j]){
            temp=j;     
            }
        }
        swap=arr[i];   
        arr[i]=arr[temp];
        arr[temp]=swap;
    } 
    
     prt(arr);

    }
}
// Selection Sort=
//                 It works by repeatedly selecting the smallest  element from the unsorted part
//   of the array and moving it to the beginning of the sorted part. 