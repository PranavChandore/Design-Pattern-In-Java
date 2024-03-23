import java.awt.*;
import java.net.StandardSocketOptions;

public class Main {
    public static void main(String[] args) {


        Shape tringle = new Tringle();

        Shape redTringle = new RedColorDecorator(tringle);

        Shape redRectangle = new RedColorDecorator(new Square());

        tringle.draw();

        System.out.println("............");

        redTringle.draw();

        redRectangle.draw();
    }
}