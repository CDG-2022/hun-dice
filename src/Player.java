public class Player {
    String name;
    Dice dice;
    int score=0;
    String mode;
    public Player(String dice,String name) {
        this.name=name;
        if(dice.equals("사기")) this.dice = new FraudDice();
        else this.dice = new NormalDice();
    }
    public void addScore(int score){
        this.score+=score;
    }
    public void play(String mode){
        this.mode=mode;
        addScore(dice.Throw(mode));
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