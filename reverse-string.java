//Write a java program to reverse a string.

public class Main{
    public static void main(String[] args){
        String str="nandana";
        String bag="";
        for(int i=0; i<str.length(); i++){
            bag=str.charAt(i)+bag;
        }
        System.out.println(bag);
    }
}