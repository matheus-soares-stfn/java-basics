import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        rpsMatch partida = new rpsMatch();

        System.out.println("Choose your play!");
        partida.setUserPlay(input.nextInt());

        partida.getResultado();
    }
}
