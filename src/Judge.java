import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Judge {

    public List<Player> call(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Player> list= new ArrayList<>();
        System.out.print("첫번째 선수입력(일반): 이름");
        list.add(new Player("일반",sc.next()));
        System.out.print("두번째 선수입력(사기): 이름");
        list.add(new Player("사기",sc.next()));
        return list;
    }
    public  void recorder(Player p1,Player p2,int x,int num){
        System.out.println(p1.getName()+" : "+p1.getScore()+" "+p2.getName()+" : "+p2.getScore()+"["+p2.getMode()+"]");
        if(x==num){
            if(p1.getScore()>p2.getScore()) System.out.println(p1.getName()+" 승리");
            else if(p1.getScore()<p2.getScore()) System.out.println(p2.getName()+" 승리");
            else System.out.println("무승부");
        }
    }
    public int count(){
        Scanner sc = new Scanner(System.in);
        System.out.print("주사위 횟수 :");
        return sc.nextInt();
    }
}
