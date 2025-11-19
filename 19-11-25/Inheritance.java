package nov19_25;

public class Inheritance {
    public static void main(String[] args) {

        Son1 s1 = new Son1();
        s1.bike();       // Son1 own method
        s1.oldBike();    // Overridden method

        Son2 s2 = new Son2();
        s2.bike();       // Son2 own method
        s2.oldBike();    // Overridden method
    }
}

class GrandFather {
    void oldBike() {
        System.out.println("Royal Enfield 1983");
    }
}

class Father extends GrandFather {   // Single Inheritance
    void oldBike() {                 // Method overriding
        System.out.println("Royal Enfield 2002");
    }
}

class Son1 extends Father {          // Multilevel Inheritance
    void bike() {
        System.out.println("KTM 390");
    }
}

class Son2 extends Father {          // Hierarchical Inheritance
    void bike() {
        System.out.println("RC KTM 390");
    }
}