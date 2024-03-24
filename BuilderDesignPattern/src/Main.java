public class Main {
    public static void main(String[] args) {

        ComputerBuilder highend = new HighEndComputerBuild();

        ComputerDirector computerDirector = new ComputerDirector(highend);

        computerDirector.constructComputer();

        Computer highendComputer = ComputerDirector.getComputer();

        System.out.println("High-end Computer Specifications:");
        System.out.println("CPU: " + highendComputer.getCpu());
        System.out.println("RAM: " + highendComputer.getRam());
        System.out.println("Storage: " + highendComputer.getStorage());
        //System.out.println("Graphics Card: " + highendComputer.getGraphicsCard());
    }
}