//Write a java program to check whether a number is prime or not.

public class Main{
    public static void main(String[] args){
        int count=0;
        int number=7;
        for(int i=2; i<number/2; i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}