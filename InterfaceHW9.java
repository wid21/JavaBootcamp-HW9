// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class InterfaceHW9 {
    public static void main(String[] args) {

        MovablePoint p1=new MovablePoint(5,5,20,20);
        System.out.print(" The moving up is :" );
        p1.moveUp();
        System.out.println();
        System.out.print(" The moving right is :" );
        p1.moveRight();
        System.out.println();
        System.out.print(" The moving down is :" );
        p1.moveDown();
        System.out.println();
        System.out.print(" The moving left is :" );
        p1.moveLeft();
        System.out.println();
    }
}