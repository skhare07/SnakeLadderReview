package review.snakeandladder;

public class SnakeAndLadderUC7 extends SnakeAndLadderUC6{

int player1=1, player2=2, player=player1 ,player1position,player2position;

    @Override
    public void OptionCheck() {
        super.OptionCheck();

        if(player==player1)
        {
            player1position=position;
        } else if (player==player2) {
            player2position=position;
        }
    }

    public void PlayerChance()
    {
        if(player==player1)
        {
            if((option==snake)||(option==noplay))
            {
                player=player2;
            }
            else if((option==snake)||(option==noplay))
            {
                player=player1;
            }
        }
    }

    public void WinnerCheck()
    {
        if(player1position==100)
        {
            System.out.println("PLayer 1 won");
        }else {
            System.out.println("PLayer 2 won");
        }
    }


    public static void main(String[] args) {
        SnakeAndLadderUC7 obj = new SnakeAndLadderUC7();

    while((obj.player1position<100) && (obj.player2position<100))
    {
        obj.DierollCheck();
        obj.OptionCheck();
        obj.PlayerChance();
    }

        System.out.println("Player 1 position :"+obj.player1position);
        System.out.println("Player 2 position :"+obj.player2position);

        obj.WinnerCheck();
    }

}
