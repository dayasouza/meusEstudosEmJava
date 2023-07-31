import java.util.Locale;
import java.util.Scanner;

public class uri1015 {

    /*
    Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e
    calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

    Distancia = raiz quadradada de (x2 -x1)² + (y2 - y1)²

    Entrada: O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de
    ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

    Saída: Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
     */

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float p1, x1, y1, p2, x2, y2, distancia;
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();

        p1 = (x2 - x1) * (x2 - x1);
        p2 = (y2 - y1) * (y2 - y1);

        distancia = (float) Math.sqrt(p1 + p2);

        System.out.printf("%.4f\n", distancia);

        sc.close();
    }
}
