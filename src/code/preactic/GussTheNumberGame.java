package code.preactic;

import java.util.Scanner;

class Game{
    private int count = 0;
    public int userNumber;
    public int compNumber;

    public Game() {
        compNumber = (int)(Math.random()*100);
        System.out.println(compNumber);
    }
    public void inputNumber(int n){
        userNumber = n;
    }

    public int isCorrectNumber(){

        if (compNumber == userNumber) {
            return 0;
        } else if (compNumber > userNumber) {
            return -1;
        }
        else{
            return 0;
        }
    }

    public void setCount(){
        count++;
    }
    public void getCount(){
        System.out.println("Number of Guesses are "+count);
    }

}
public class GussTheNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game  =  new Game();

        while(true){
            System.out.print("Guess Number between 1 to 100: ");
            int num = sc.nextInt();
            game.inputNumber(num);
            if (game.isCorrectNumber() == 0){
                game.setCount();
                System.out.println("You have Guess The Number");
                game.getCount();
                break;
            }else if (game.isCorrectNumber() == -1){
                game.setCount();
                System.out.println("Number is Smaller then the Computer number.");
            }else if(game.isCorrectNumber() == 1){
                game.setCount();
                System.out.println("Number is Greater then the Computer number.");
            }
        }
    }

}
