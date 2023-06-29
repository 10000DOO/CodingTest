package 백준;

import java.util.Scanner;

public class Bj11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String inputNum =sc.next();

        char[] charArr = inputNum.toCharArray();

        int sum = 0;
        for(char i : charArr){
            sum += (i - '0');
        }
        System.out.println(sum);
    }
}
