public class RedColorDecorator extends ShapeDecorator {

    public RedColorDecorator(Shape shapesDecorated) {
        super(shapesDecorated);
    }

    public void draw()
    {
        shapesDecorated.draw();
        setRedColorDecorator(shapesDecorated);

    }
    public void setRedColorDecorator(Shape shaspesDecorated){
        System.out.println("Red Color set to "+ shaspesDecorated);

    }

}
