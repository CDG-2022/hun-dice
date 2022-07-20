public class Player {
    String name;
    private final Dice dice;
    int score=0;
    String mode;


    public Player(Dice dice,String name){
        this.dice=dice;
        this.name=name;
    }

    public void addScore(int score){
        this.score+=score;
    }
    public void play(String mode){
        this.mode=mode;
        addScore(dice.roll(mode));
    }
    public int getScore(){
        return score;
    }
    public String getName(){
        return name;
    }
    public String getMode(){
        return mode;
    }
}