import java.util.Scanner;

public class uri1016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int dist, tempo;
        int veloX = 60;
        int vloY = 90;

        dist = sc.nextInt();

        tempo = dist * 2;

        System.out.println(tempo + " minutos");
        sc.close();
    }
}
