public class Driver {

    public static  void main(String args[]){

        ShapeOfFactory driver = new ShapeOfFactory();

        System.out.println(driver.getShapeInstance(Shapes.Rectangle));

        System.out.println(driver.getShapeInstance(Shapes.Square));
    }

}
