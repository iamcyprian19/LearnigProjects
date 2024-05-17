import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        int count=5,guess=0;
        NumberGuesser game = new NumberGuesser();
        int num = (int)(Math.abs(Math.random())*50);
        System.out.println("guess the Number ranging between 0 to 50 : ");


        for(int i=count;i>0;i--){
            System.out.println("You have "+i+" Chances left ");
            guess=game.getData();
            if(guess==-1){
                i++;
                continue;
            }
            game.getResult(guess,num);

        }
        if(guess!=num){
            System.out.println("Sorry but you lost! ");
            System.out.println("Correct Answer is "+num);
        }

    }


}