public class ShapeOfFactory {

    public Shape getShapeInstance(Shapes type){

        if(type == Shapes.Rectangle){
            return new Rectangle();
        }else if(type == Shapes.Square){
            return new Square();
        }else if(type == Shapes.Tringle){
            return new Tringle();
        }

        return null;
    }

}
