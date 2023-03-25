//Write a java program to find the Largest and Smallest element present in an array.

public class Main{
    public static void main(String[] args){
        int max=0;
        int min=0;
        int arr[]=new int[]{1,2,3,4,0,6,23,79};
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min) ;
    }
}