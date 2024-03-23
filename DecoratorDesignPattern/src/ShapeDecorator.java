public abstract class ShapeDecorator implements Shape{

    protected  Shape shapesDecorated;

    public ShapeDecorator(Shape shapesDecorated){
        this.shapesDecorated = shapesDecorated;
    }
    

    public void draw(){
        shapesDecorated.draw();
    }


}
