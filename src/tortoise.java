/**
 *
 * @author Ankur
 */
public class tortoise {
    private char[][] position = new char[20][20];
    private int x = 0;
    private int y = 0;
    private boolean flag = false;
    private char direction='E';

    
    
    public void setPosition(int a, int b , char content) {
        this.position[a][b] = content;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }
    

    public char getPosition(int x,int y) {
        return this.position[x][y];
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isFlag() {
        return flag;
    }

    public char getDirection() {
        return direction;
    }
}
