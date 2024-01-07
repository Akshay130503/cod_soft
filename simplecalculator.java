import java.util.Scanner;
public class simplecalculator {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the total number of subjects ");
    int n = sc.nextInt();
    System.out.println("enter the marks of each subject one by one ");
    int marks[] = new int[n];
    int Total=0;
    int totalsubjects = 0;
    int averagepercentage = 0 ;
    boolean valid_input = true;
    for(int i=0;i<n;){
      marks[i] = sc.nextInt();
      if (marks[i]> 100 || marks[i] < 0){
        System.out.println("Please enter a valid number between 0 and 100 ");
        valid_input = false;
          }
      else{
        Total+=marks[i];
        totalsubjects++;
      }
      i++;
        }
    if (totalsubjects > 0  && valid_input == true )
      averagepercentage = Total/totalsubjects;
      char grade ;
      if(averagepercentage >90 )
        grade = 'A';
      else if(averagepercentage > 80 )
        grade = 'B';
      else if(averagepercentage>70 )
        grade = 'C';
      else if(averagepercentage>60)
        grade = 'D';
      else if (averagepercentage > 40)
        grade = 'E';
      else 
        grade = 'F';
      System.out.println("YOur grade is : "+grade) ;

    }
}
