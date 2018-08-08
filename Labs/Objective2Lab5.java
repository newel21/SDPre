public class Objective2Lab5 {
  public static void main(String[] args) {
    double side1, side2, hypotenuse; //square

    side1 = Math.pow(10.0, 2);
    side2 = Math.pow(8.0, 2);
    hypotenuse = Math.sqrt(side1+side2);

    //System.out.println("The hypotenuse of a triangle with sides " + side1 "and " + side2 "is " + hypotenuse);
    System.out.println("The hypotenuse of a triangle with sides 10.0 and 8.0 is " + hypotenuse);
  }
}
