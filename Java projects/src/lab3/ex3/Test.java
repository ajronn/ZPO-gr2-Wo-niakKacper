package lab3.ex3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Reader reader = new Reader();

        while(true){
            System.out.println("Wprowadz liczbe\n");
            int digit = input.nextInt();
            reader.ask(digit);

        }
    }
}
