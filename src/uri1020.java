import java.util.Scanner;

/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo m~es com 30 dias.
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada: O arquivo de entrada contém um valor inteiro.

Saída: Imprima a saída conforme exemplo fornecido.
 */

public class uri1020 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int idade, ano, resto, mes, dia;

        idade = sc.nextInt();

        ano = idade / 365;
        resto = idade % 365;
        mes = resto / 30;
        dia = resto % 30;

        System.out.println(ano + " ano (s)\n" + mes + " mes (es)\n" + dia + " dia (s)");

        sc.close();
    }
}
