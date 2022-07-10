import java.util.Random;
public class FraudDice implements Dice{
    Random random = new Random();
    @Override
    public int Throw(String mode) {


        if(mode.equals("Weak")){
            return random.nextInt(5);
        }
        else if(mode.equals("STRONG")){
            return random.nextInt(5)+3;
        }
        else {//NORMAL
            return random.nextInt(6)+1;
        }
    }
}
