import java.util.Random;
public class NormalDice implements Dice{
    Random random = new Random();

    @Override
    public int Throw(String mode) {


        return random.nextInt(6)+1;

    }
}
