public class ComputerDirector {
    private static ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }

    public void constructComputer(){
        computerBuilder.buildCpu("i9");
        computerBuilder.buildRam("3gb");
        computerBuilder.buildStorage("500GBHDD");
    }

    public static Computer getComputer(){
        return  computerBuilder.build();
    }



}
