import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // TODO: Problem 1
    System.out.println("ratio: input 2 ints, first int is numerator, 2nd int is denominator");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    ratio(num1, num2);

    // TODO: Problem 2
    System.out.println("divisible: input 2 ints, first int is numerator, 2nd int is denominator");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    divisible(num1, num2);
    
    // TODO: Problem 3
    System.out.println("fifties: Enter an integer in the fifties");
    num1 = sc.nextInt();
    fifties(num1);
    
    System.out.println("inclass: input dimensions in double of rectangle 1, len then width, same thing with rectangle 2");
    double lr1 = sc.nextDouble();
    double wr1 = sc.nextDouble();
    double lr2 = sc.nextDouble();
    double wr2 = sc.nextDouble();
    Rectangle rect1 = new Rectangle(lr1, wr1);
    Rectangle rect2 = new Rectangle(lr2, wr2);
    System.out.println("are the 2 rectangles equal? " + rectEqual(rect1, rect2));

    sc.close();
  }

  // TODO: In-class assignment
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise.  Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal.

  public static boolean rectEqual(Rectangle r1, Rectangle r2)
  {
    // implement solution here
    return r1.equals(r2);
  }
  public static void ratio(int x1, int x2){

    if (x2 == 0){
      System.out.println("error, you cant divide by 0 bucko");
    }
    else if ((x1 / x2 > 1) && (x1 / x2 <= 8)){
      System.out.println("ratio OK");
    }
    else{
      System.out.println("ratio not OK >:(");
    }
  }
  public static void divisible(int x1, int x2){
    if (x2 == 0){
      System.out.println("error, 0 is an invalid input");
    }
    else if (x1 % x2 == 0){
      System.out.println("2nd num is factor of 1st num");
    }
    else{
      System.out.println("2nd num is not factor of 1st num");
    }
  }
  public static void fifties(int x1){
    if ((x1 >=50) && (x1 <= 59)){
      System.out.println("your number is " + x1);
    }
    else{
      System.out.println("thats not a number in the fifties!!! \nyour number is 55");
    }
  }
}
