package review.snakeandladder;

import java.util.Random;

public class SnakeAndLadderUC2 {
int dieroll;

public void DierollCheck()
{
    Random r = new Random();
    dieroll=r.nextInt(7);
}


    public static void main(String[] args) {
        SnakeAndLadderUC2 obj = new SnakeAndLadderUC2();
       obj.DierollCheck();
        System.out.println("PLayer got :"+obj.dieroll);
    }
}
