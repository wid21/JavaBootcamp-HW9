public class MovablePoint {

    private int y;
    private int x;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int y, int x, int xSpeed, int ySpeed) {
        this.y = y;
        this.x = x;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    void moveDown(){
        System.out.print(y+=ySpeed);
    }
    void moveRight(){
        System.out.print(x+=xSpeed);
    }
    void moveUp(){
        System.out.print(y-=ySpeed);
    }
    void moveLeft(){
        System.out.print(x-=xSpeed);
    }
}
