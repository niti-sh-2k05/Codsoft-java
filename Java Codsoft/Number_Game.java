import java.util.Scanner;

public class Number_Game {
    public static void main(String[] args) {
        System.out.println("Welcome to Number game!");
        System.out.println("Enter Your choice");

        double randomdble = Math.random();
        int rndnumber = (int) (randomdble * 100) + 1;
        
        for(int i=0;i<5;i++){
         

        Scanner inp=new Scanner(System.in);
        int guess=inp.nextInt();
        
        if(guess<rndnumber){
            System.out.println("Your Guess is low!Try again");
        }
        else if(guess>rndnumber){
            System.out.println("Your Guess is High!Try again");
        }
        else if(guess == rndnumber){
            System.out.println("Congrats You Won!");
        }
         
        

    }
    System.out.println("The Random Number is:"+rndnumber);
}
}
