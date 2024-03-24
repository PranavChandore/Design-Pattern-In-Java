public class HighEndComputerBuild implements ComputerBuilder{

    private Computer computer;

    HighEndComputerBuild(){
        this.computer = new Computer("Default CPU", "Default RAM", "Default Storage", "Default Graphics Card");
    }


    @Override
    public void buildCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void buildRam(String ram) {
            computer.setRam(ram);
    }

    @Override
    public void buildStorage(String storage) {
        computer.setStorage(storage);
    }

    @Override
    public void buildSetGraphicsCard(String graphicsCard) {
        return ;
    }


    @Override
    public Computer build() {
        return computer;
    }
}
