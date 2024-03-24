public interface ComputerBuilder {

    void buildCpu(String cpu);
    void buildRam(String ram);
    void buildStorage(String storage);
    void buildSetGraphicsCard(String graphicsCard);

    Computer build();
}
