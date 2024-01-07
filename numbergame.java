// Java program for Random number guesser 
import java.util.*;

public class numbergame{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int chances = 6;
    int finals = 0;
    boolean playAgain = true;
    System.out.println("welcome ");
    System.out.println("Hey great job trying  "+chances +"to try again and and guess ");
    while(playAgain){
      int rand=getrandN(1,100);
      boolean guess = false;
      for(int i=0;i<chances;i++){
        System.out.println("Chance"+(i+1)+"Enter your Guess");
        int user=sc.nextInt();
        if(user == rand){
          guess = true;
          finals+=1;
          System.out.println("you won it ");
          break;
        }
        else if (user >rand){
          System.out.println("Too High");
        }
        else {
          System.out.println("Too low ");
        } 

      }
      if(guess == false ){
          System.out.println("Sorry dude u lost the chance,The number is "+rand);
      }
      System.out.println("do u want to play again(y/n)");   
      String pA = sc.next();
      playAgain = pA.equalsIgnoreCase("y");
    }
    System.out.println("thats it buddy,Hope you enjoyed it ");
    System.out.println("Here is your score "+finals);
    }
  public static int getrandN(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
  
}




