import java.util.Scanner;
public class NumberGuesser{
    //input
    public int getData(){
        int num=0,cond=0;
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Guess The Number : ");
            num = input.nextInt();
            cond=1;
        } catch (Exception e) {
            System.out.println("Wrogn Input try again : ");
            return -1;
        }
        return num;
    }

    //compare
    public int getResult(int guess, int num) {
        if (guess == num) {
            System.out.println("Woooh you won!");
            System.exit(0);
        } else if (guess > num) {
            System.out.println("Your guess is too high");
        } else if (guess<num) {
            System.out.println("Your guess is too low");
        }
        return 1;
    }

}