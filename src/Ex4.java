import java.util.Scanner;

public class Ex4 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        IO.println("Soma: " + soma);


    }
    }
