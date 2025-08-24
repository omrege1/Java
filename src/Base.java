public class Base {
    protected void display() {
        System.out.println("Base Display");
    }
}

class Derived extends Base {
    @Override
    protected void display() {
        System.out.println("Derived Display");
    }
    public void show() {
        System.out.println("Derived Show");
    }
}

class Test {
    public static void test(Base b) {
        b.display();
//        b.show();
    }

    public static void main(String[] args) {
        Base b1 = new Base();
        Base b2 = new Derived();
        Derived d1 = new Derived();
        test(b1);
        test(b2);
        test(d1);
    }
}
