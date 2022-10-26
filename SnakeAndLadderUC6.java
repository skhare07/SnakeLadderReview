package review.snakeandladder;

public class SnakeAndLadderUC6 extends SnakeAndLAdderUC5 {
int counter;
    @Override
    public void DierollCheck() {
        super.DierollCheck();
        counter++;
    }

    public static void main(String[] args) {
        SnakeAndLadderUC6 obj = new SnakeAndLadderUC6();
        obj.FinalPosition();
        System.out.println("Player is at Position :"+obj.position);
        System.out.println("Total die roll count :"+obj.counter);


    }
}
