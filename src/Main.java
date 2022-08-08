import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("chuoi can kiem tra");
        Scanner in= new Scanner(String.valueOf(String.CASE_INSENSITIVE_ORDER));
        String inputString = in.nextLine();
        Stack stack = new Stack<>();
        for (int i =0; i< inputString.length(); i ++){
            stack.push(inputString.charAt(i));
        }
        String reverseString = "";
        while (!stack.isEmpty()){
            reverseString = reverseString+stack.pop();
        }
        if (inputString.equals(reverseString))
            System.out.println("day la chuoi doi xung");
        else
            System.out.println("day ko phai chuoi doi xung");
    }
}