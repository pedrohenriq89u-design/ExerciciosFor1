import java.util.Scanner;

public class Ex03 {
    static void main(){

        Scanner sc = new Scanner(System.in);

        IO.println("Digite um número: ");
        int num = sc.nextInt();

        int soma = 0;

        for (; num != 0; num /= 10) {
            soma += num % 10;
        }

        IO.println("Soma dos dígitos: " + soma);
}
    }
