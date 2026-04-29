import java.util.Scanner;

public class Ex1 {
    static void main(){

        Scanner sc = new Scanner(System.in);


        IO.println("Digite um numero: ");
        int num = sc.nextInt();
        int res = 0;
        int cont = 0;

        while (cont <= num){
            res = res + cont;
            cont++;

        }

        IO.println(res);

    }
}





