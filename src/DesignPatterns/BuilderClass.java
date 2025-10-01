package DesignPatterns;

class Computer1{
    private String cpu;
    private String ram;

    Computer1(ComputerBuilder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
    }

    @Override
    public String toString(){
        return cpu + " " + ram;
    }

    public static class ComputerBuilder{
        private String cpu;
        private String ram;

        public ComputerBuilder(String cpu, String ram){
            this.cpu = cpu;
            this.ram = ram;
        }

        public Computer1 build(){
            return new Computer1(this);
        }
    }
}

public class BuilderClass {
    public static void main(String[] args) {
        Computer1 computer1 = new Computer1.ComputerBuilder("100","255").build();
        System.out.println(computer1);
    }

}
