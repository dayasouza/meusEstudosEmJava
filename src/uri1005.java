import java.util.Locale;
import java.util.Scanner;

public class uri1005 {
    /*
    Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno.
    A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11).
    Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

    Entrada: O arquivo de entrada contém 2 valores com uma casa decimal cada um.

    Saída: Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal e
    com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas,
    não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error". */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, media;
        double pesoA = 3.5;
        double pesoB = 7.5;

        a = sc.nextDouble();
        b = sc.nextDouble();

        media = (a * pesoA + b * pesoB) / 11.0;

        System.out.printf("MEDIA = %.5f\n" , media);

        sc.close();
    }
}
