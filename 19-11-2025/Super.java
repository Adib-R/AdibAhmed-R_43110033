package nov19_25;

public class Super {
    public static void main(String[] args) {
        Son6 s = new Son6();
        s.car();       // Son6’s own method
        s.oldCar();    // Son6’s overridden method + super call
    }
}

class Father6 {
    String car = "Toyota Corolla 2002";

    void oldCar() {
        System.out.println("Father6’s Car: " + car);
    }
}

class Son6 extends Father6 {
    String car = "BMW 2025";

    void car() {
        System.out.println("Son6’s Car: " + car);
    }

    @Override
    void oldCar() {
        System.out.println("Son6 also has: " + car);
        super.oldCar();   // calls Father6’s version explicitly
    }
}