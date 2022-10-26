package review.snakeandladder;

public class SnakeAndLadderUC4 extends SnakeAndLadderUC3 {

    public void FinalPosition()
    {
        while(position<100)
        {
            DierollCheck();
            OptionCheck();
        }
    }


    public static void main(String[] args) {
        SnakeAndLadderUC4 obj = new SnakeAndLadderUC4();
        obj.FinalPosition();
        System.out.println("Player is at Position :"+obj.position);

    }
}
