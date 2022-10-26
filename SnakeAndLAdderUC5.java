package review.snakeandladder;

public class SnakeAndLAdderUC5 extends SnakeAndLadderUC4 {

    @Override
    public void OptionCheck() {
        super.OptionCheck();
        if(position>100)
        {
            position-=dieroll;
        }

    }


    public static void main(String[] args) {
        SnakeAndLAdderUC5 obj = new SnakeAndLAdderUC5();
        obj.FinalPosition();
        System.out.println("Player is at position :"+obj.position);
    }
}
