import java.util.*;
public class SBuble{
public static void prt(int [] a){
for(int i=0;i<a.length;i++){
    System.out.print(a[i]+" ");
}System.out.println("");}
public static void main(String [] args){
int [] arr={2,2,4,6,7,8,9,6,45,657,567,45,5,677,64,4};
int count =0;
int countE=0;
for(int i=arr.length-1;i>=0;i--){
for(int j=i-1;j>=0;j--){
    if(arr[i]<arr[j]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }count+=1;
    }prt(arr);
countE+=1;}
System.out.print("countE="+countE+" count="+count);}}
// Bubble Sort is a simple sorting algorithm=
//                                           The algorithm gets its name because smaller elements
//  "bubble" to the top of the list while larger elements "sink" to the bottom.