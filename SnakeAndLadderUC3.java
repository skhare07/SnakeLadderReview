package review.snakeandladder;

import java.util.Random;

public class SnakeAndLadderUC3 extends SnakeAndLadderUC2{
    int position;
    int ladder=0,snake=1,noplay=2;
    int option;
    public void OptionCheck()
    {
        Random r = new Random();
        option=r.nextInt(3);

   if(option==ladder)
   {
       position+=dieroll;
   } else if (option==snake)
   {
   position-=dieroll;
   } else if (option==noplay) {
       position-=dieroll;
   }


   if(position<0)
   {
       position=0;
   }
    }

    public static void main(String[] args) {
        SnakeAndLadderUC3 obj = new SnakeAndLadderUC3();
        obj.DierollCheck();
        obj.OptionCheck();
        System.out.println("Player got : "+obj.dieroll);
        System.out.println("Option : "+obj.option);
        System.out.println(" PLayer is at Posotion :"+obj.position);





    }

}
