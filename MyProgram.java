import java.util.*;
import java.util.Scanner;


public class MyProgram {
  public static void main(String[] args) {
    String name = "";
    double passes = 0;
    double shots = 0;
    double appearances = 0;
    double pass_avg;
    double shots_avg;
    int counter = 0;
    while (counter < 4) {
      Scanner keyboard = new Scanner(System.in);
      if (counter == 0) {
        System.out.println("Enter name ");
        name = keyboard.nextLine();
      }
      counter++;
      if (counter == 1) {
        System.out.println("Enter the number of passes ");
        passes = keyboard.nextDouble();
      }
      if (passes > 0) {
        counter++;
      }
      if (passes < 0) {
        System.out.println("invalid input");
        counter = 0;
      }


      if (counter == 2) {
        System.out.println("Enter the number of shots ");
        shots = keyboard.nextDouble();
      }
      if (shots > 0) {
        counter++;
      }
      if (shots < 0) {
        System.out.println("invalid input");
        counter = 0;
      }


      if (counter == 3) {
        System.out.println("Enter the number of appearances ");
        appearances = keyboard.nextDouble();
      }
      if (appearances > 0) {
        counter++;
      }
      if (appearances < 0) {
        System.out.println("invalid input");
        counter = 0;
      }
      pass_avg = passes / appearances;
      shots_avg = shots / appearances;
      regular_player bro = new regular_player(name, passes, shots, appearances, pass_avg, shots_avg);
      if (counter == 4) System.out.println(bro.toString());
    }
  }
}
