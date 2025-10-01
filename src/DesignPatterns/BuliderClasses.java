package DesignPatterns;


class Computer{
    private String cpu;
    private String ram;
    private String storage;

    public void setCpu(String cpu){
        this.cpu = cpu;
    }

    public void setRam(String ram){
        this.ram = ram;
    }

    public void setStorage(String storage){
        this.storage = storage;
    }

    public void getResult(){
        System.out.println("CPU " + cpu + "RAM " + ram + "Storage " + storage);
    }
}

interface Builder{
    void buildCPU();
    void buildRAM();
    void buildStorage();
    Computer getResult();
}

class GamingComputerBuilder implements Builder{
    private Computer computer = new Computer();

    public void buildCPU(){
        computer.setCpu("Gaming CPU");;
    }

    public void buildRAM(){
        computer.setRam("Gaming RAM");;
    }

    public void buildStorage(){
        computer.setStorage("Gaming Storage");;
    }

    public Computer getResult(){
        return computer;
    }

    
}


class ComputerDirector{
    public void construct(Builder builder){
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
    }
}


public class BuliderClasses {
    public static void main(String[] args) {
        GamingComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        Builder builder = new GamingComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector();
        computerDirector.construct(builder);
        Computer computer = builder.getResult();
        computer.getResult();
    }
}
