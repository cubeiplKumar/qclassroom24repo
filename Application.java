class Main {

  // create a method
  public int addNumbers(int a, int b) {
    int sum = a + b;
    // return value
    return sum;
  }

  public static void main(String[] args) {
    
    int num1 = 25;
    int num2 = 15;

    // create an object of Main
    Main obj = new Main();
    // calling method
    int result = obj.addNumbers(num1, num2);
    System.out.println("Sum is: " + result);
  }
  public static void main(String[] args) {
    int result;

    // call the method
    // store returned value to result
    result = square(10);

    System.out.println("Squared value of 10 is: " + result);
  }
  #feature201 changes done by Vivek on 10-oct-2022 on Savings Module for HDFC Project
  public class DemoClass{
 
 public static void main (String[] args){
    System.out.println("Hello , this is sample program");   
    double d = Math.random();
    System.out.println("Random Number:"+d);
 }
 }
}