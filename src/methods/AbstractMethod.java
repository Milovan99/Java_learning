package methods;

public class AbstractMethod {
    public static void main(String[] args) {
            Car mercedes = new Car();
            mercedes.gas();
            mercedes.kocnica();
    }
}

abstract class FunkcijeAuta{
    abstract void gas();
    abstract void kocnica();
}

class Car extends FunkcijeAuta{

    @Override
    void gas() {
        System.out.println("Auto je krenulo");
    }

    @Override
    void kocnica() {
        System.out.println("Auto je stalo");
    }
}
