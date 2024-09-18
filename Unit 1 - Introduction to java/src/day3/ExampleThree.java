package day3;

public class ExampleThree {
    public static void main(String[] args) {
        int mark1 = 87, mark2 = 97, mark3 = 63;
        double numMarks = 3;
        //Casting int to double changng it
        // Gain precision widening conversion
        double average = (mark1+mark2+mark3)/numMarks;
        System.out.println(average);

    }
}
