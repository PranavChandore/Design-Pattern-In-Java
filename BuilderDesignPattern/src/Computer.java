

public class Computer {


    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;

    public Computer(String cpu, String ram, String storage, String graphicsCard){
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }


    public void setCpu(String cpu) {

        this.cpu = cpu;
    }

    public void setRam(String ram) {

        this.ram= ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

}
