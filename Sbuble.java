            
import java.util.*;
public class Sbuble{
public static void main(String [] args){
    int []arr={ 7,5,8,9,2,3,5,9,5,2};
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
if(arr[i]>arr[j]){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
}
}