/*Write a function to remove duplicate characters from a string and return the modified string.Input: "banana"
Output: "ban"*/

import java.util.*;
public class RemoveDuplicate {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string here:");
        String word = sc.nextLine().toLowerCase();

        boolean arr[] = new boolean[26];

        String newString = "";
        for(int i=0;i<word.length();i++){
            char currChar = word.charAt(i);
            int idx = currChar - 'a';
            if(arr[idx] == false){
                newString += currChar;
                arr[idx] = true;
            }
        }

        System.out.println(newString);
    }
}