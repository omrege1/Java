package DesignPatterns;
interface Product{
    void display();
}

class ConcreteProductA implements Product{
    public void display(){
        System.out.println("In concrete product A");
    }
}

class ConcreteProductB implements Product{
    public void display(){
        System.out.println("In concrete product B");
    }
}

interface Factory{
    Product factoryMethod();
}

class ConcreteFactoryA implements Factory{
    public Product factoryMethod(){
        return new ConcreteProductA();
    }
}

class ConcreteFactoryB implements Factory{
    public Product factoryMethod(){
        return new ConcreteProductB();
    }
}



public class FactoryClasses {
    public static void main(String args[]){
        Factory A = new ConcreteFactoryB();
        Product ap = A.factoryMethod();
        ap.display();
    }
}
