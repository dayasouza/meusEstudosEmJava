import java.util.Locale;
import java.util.Scanner;

/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de
uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada: O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros
e um valor com 2 casas decimais.

Saída: A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois
pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
 */

public class uri1010 {
    public  static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1, qtd1, codigo2, qtd2;
        double valor1, valor2, total;

        codigo1 = sc.nextInt();
        qtd1 = sc.nextInt();
        valor1 = sc.nextDouble();
        codigo2 = sc.nextInt();
        qtd2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total = valor1 * qtd1 + valor2 * qtd2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        sc.close();
    }
}
