package demo;

import java.util.Scanner;
class Launch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.next();

        String rev = "";

        for(int i = s.length()-1; i >= 0; i--)
            rev += s.charAt(i);

        if(s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

