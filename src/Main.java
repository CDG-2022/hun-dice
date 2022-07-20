import java.util.List;

public class Main {

    public static void main(String[] args) {

        Judge judge = new Judge();
        List<Player> call = judge.call();


        Player player1= call.get(0);
        Player player2 = call.get(1);

        int num=judge.count();

        for(int x=0;x< num;x++){

            if(player1.getScore()> player2.getScore()) {
                player2.play("STRONG");
                player1.play("NORMAL");}

            else if (player1.getScore()+6<= player2.getScore()) {
                player2.play("Week");
                player1.play("NORMAL");}

            else {
                player2.play("Normal");
                player1.play("NORMAL");}

            judge.recorder(player1,player2,x,num-1);

        }

    }

}
