import java.util.InputMismatchException;

public class rpsMatch {
    private int userPlay;
    private int computerPlay;
    boolean validAnswer = false;


    public void setUserPlay(int play){
        while(!validAnswer){
            try{
                if(play < 1 || play > 3){
                    error();
                } else{
                    userPlay = play;
                    validAnswer = true;
                }
            } catch(InputMismatchException error){
                error();
            }
        }
    }

    public int getUserPlay(){
        return userPlay;
    }

    public int getComputerPlay(){
        computerPlay = (int)(Math.random() * 2.5 + 1);
        return computerPlay;
    }

    public void error(){
        System.out.println("The number must be an integer, from 1 to 3.");
        System.out.println("Choose a number!\nRock (1)\nPapers (2)\nScissors (3)");
    }

    public void getResultado(){

        var player = getUserPlay();
        var computer = getComputerPlay();
        if(player != computer){
            if(player == 1 && computer == 3 || player == 2 && computer == 1 || player == 3 && computer == 2){
                System.out.println("You won!");
                System.out.println("The match went: \nPlayer: " + player + " Computer: " + computer);
            } else{
                System.out.println("You lost!");
                System.out.println("The match went: \nPlayer: " + player + " Computer: " + computer);
            }
        } else{
            System.out.println("It's a tie!");
            System.out.println("The match went: \nPlayer: " + player + " Computer: " + computer);
        }
    }
}
