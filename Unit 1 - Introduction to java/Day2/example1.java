package day2;

public class example1 {

    public static void main(String[] args) {
        int number = 4111;
        int digit1 = number / 1000;
        int digit4 = number %10;
        int digit2 = number / 100 %10;
        int digit3 = number / 10 %10;

        system.out.println(digit1 + digit2 + digit3 + digit4);


}
}