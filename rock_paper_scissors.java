import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissors {
    public static void main(String[]args){
       rock_paper_scissors();
    }
    public static void rock_paper_scissors(){
        System.out.println("welcome to rock paper scissor game :");
        Scanner sc=new Scanner(System.in);
        Random ra=new Random();
        System.out.println("enter your choice as (rock or paper or scissor) :");
        String user_choice= sc.nextLine().toLowerCase();
        int comp_choice= ra.nextInt(3);
        String[] choices={"rock","paper","scissor"};
        String computer_choice=choices[comp_choice];
        System.out.println("computer choice is :"+computer_choice);
        //win or lose determination
        if(user_choice.equals(computer_choice)){
            System.out.println("it is tie ! :");
        } else if ((user_choice.equals("rock") && computer_choice.equals("scissor"))||
                (user_choice.equals("paper") && computer_choice.equals("rock"))||
                (user_choice.equals("scissor") && computer_choice.equals("paper")))
        {
            System.out.println("you win ! :");
        }
        else{
            System.out.println("computer win !");
        }
        play_again();
    }
    public static void play_again(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 'y' for play again or 'n' for exit ! :");
        String s= sc.nextLine().toLowerCase();
        if(s.equals("y")){
            rock_paper_scissors();
        }
        else {
            System.out.println("thank you for playing game ! :");
            return;
        }
        sc.close();
    }
}
