import java.util.Scanner;
public class quiz_test {
    public static void main(String[]args){
        System.out.println("WELCOME TO QUIZ TEST :");
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your name as you resistor :");
        String name= sc.nextLine();
        System.out.println("enter your roll no :" );
        int roll= sc.nextInt();
        String [] answer={"a","b","b"};
        String [] response={"","",""};
        int i;
        System.out.println("for attempts the exam type 'y' or type 'n' for exit :");
        String choice= sc.next();
        if(choice.equals("y")){
            System.out.println("answer all the questions :");
            System.out.println("write only options :");
            System.out.println("1. "+" what is the capital of india ?");
            System.out.println("(a) ."+ "Delhi ");
            System.out.println("(b) ."+"mumbai ");
            System.out.println("(c) ."+"pune ");
            System.out.println("(d) ."+"bangalore ");
            System.out.print("1>");
            response[0]= sc.next();
            System.out.println("2. "+" who is captain of team india cricket team ?");
            System.out.println("(a) ."+"MS Dhoni");
            System.out.println("(b) ."+"Rohit sharma ");
            System.out.println("(c) ."+"Virat Kholi");
            System.out.println("(d) ."+"Rabindra Jadeja");
            System.out.print("2>");
            response[1]= sc.next();
            System.out.println("3. "+" who is captain of csk team ?");
            System.out.println("(a) ."+"MS Dhoni");
            System.out.println("(b) ."+"Ruturaj Gaikwad");
            System.out.println("(c) ."+"Rabindra Jadeja");
            System.out.println("(d) ."+"Ajinkya Rahane");
            System.out.print("3>");
            response[2]= sc.next();
            int score=0;
            for (i=0;i<3;i++){
                if(response[i].equalsIgnoreCase(answer[i])){
                    score++;
                }
            }
            System.out.println(" your score is :"+score+"/3 :");
            System.out.println("Thank you for attend the Quiz Test :");
        }
        else{
            return;
        }
    }
}
