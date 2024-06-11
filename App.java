import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo). */
    Scanner sc = new Scanner(System.in);
        int in = 0;
		int out = 0;
    System.out.println("Informe a quantidade de valores Inteiros");
    int N = sc.nextInt();

    for(int i = 0; i < N; i++){
        System.out.println("Informe o valor de X");
            int X = sc.nextInt();
        if( X >= 10 && X <= 20){
            in++;
        }else{
            out++;
        }
        System.out.println("Valores dentro do intervalo: " + in);
        System.out.println("Valores fora do intervalo: " + out); 
    }
    }
}
