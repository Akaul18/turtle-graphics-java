/**
 *
 * @author Ankur
 */
import java.util.Scanner;

public class TortoiseTest {

    public static void main(String[] args) {
        
        tortoise tort = new tortoise();
        int x,y;
        int input=0;
        
        while(input != 9)
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter command (9 to end input): ");
            input = scan.nextInt();
            if(input == 1){
                tort.setFlag(false);
            }
            if(input ==2)
            {
                tort.setFlag(true);
            }
            if(input == 3)
            {
                if(tort.getDirection()=='E'){

                    tort.setDirection('S');

                }else if(tort.getDirection()=='S'){

                    tort.setDirection('W');

                }else if(tort.getDirection()=='W'){

                    tort.setDirection('N');

                }else if(tort.getDirection()=='N'){

                    tort.setDirection('E');

                }
            }

            if(input == 4)
            {
                if(tort.getDirection()=='E'){

                    tort.setDirection('N');

                }else if(tort.getDirection()=='S'){

                    tort.setDirection('E');

                }else if(tort.getDirection()=='W'){

                    tort.setDirection('S');

                }else if(tort.getDirection()=='N'){

                    tort.setDirection('W');

                }
            }
            if(input == 5){
                System.out.print("Enter forward spaces (9 to end input): ");
                int moves = scan.nextInt();

                if(tort.getDirection()=='E'){

                    x = tort.getX();

                    for(int row=0; row < moves; row++)
                    {
                        if(tort.isFlag())
                        {
                            tort.setPosition(x, tort.getY(), '*');
                        }
                        else{
                            tort.setPosition(x, tort.getY(), ' ');
                        }
                        x+=1;
                    }
                    tort.setX(x);
                }
                else if(tort.getDirection()=='S'){

                    y = tort.getY();
                    for(int column=0; column < moves; column++)
                    {
                        if(tort.isFlag())
                        {
                            tort.setPosition(tort.getX(), y, '*');
                        }
                        else{
                            tort.setPosition(tort.getX(), y, ' ');
                        }
                        y+=1;
                    }
                    tort.setY(y);

                }else if(tort.getDirection()=='W'){

                    x = tort.getX();
                    for(int row=0; row < moves; row++)
                    {
                        if(tort.isFlag())
                        {
                            tort.setPosition(x, tort.getY(), '*');
                        }
                        else{
                            tort.setPosition(x, tort.getY(), ' ');
                        }
                        x-=1;
                    }
                    tort.setX(x);
                }else if(tort.getDirection()=='N'){

                    y = tort.getY();
                    for(int column=0; column < moves; column++)
                    {
                        if(tort.isFlag())
                        {
                            tort.setPosition(tort.getX(), y, '*');
                        }
                        else{
                            tort.setPosition(tort.getX(), y, ' ');
                        }
                        y-=1;
                    }
                    tort.setY(y);
                }
            }
//            System.out.println(tort.getX());
//            System.out.println(tort.getY());
//            System.out.println(tort.getPosition());
            if(input == 6)
            {
                for(int row = 0; row<20; row++)
                {
                    for(int column = 0; column<20; column++)
                    {
                        if(tort.getPosition(row,column)!='*')
                        {
                            System.out.print(' ');
                        }
                        else{
                            System.out.print(tort.getPosition(row,column));
                        }
                    }
                    System.out.println();
                }
            } 
        }
    }
}
