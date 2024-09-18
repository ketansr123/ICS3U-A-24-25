package day3;

public class ExampleFour {
    public static void main(String[] args) {
        int mark1 = 87, mark2 = 97, mark3 = 63;
        int numMarks = 3;
       
        // Gain precision widening conversion
        //Explicit cast on numMarks to convert to a douible 
        double average = (mark1+mark2+mark3)/(double)numMarks;
        System.out.println(average);

    }
    
}
