package nov19_25;

public class Final {
    public static void main(String[] args) {
        Son5 s = new Son5();
        s.bike();       // Son’s own method
        s.Secbike();    // inherited final method from Father5
    }
}

class Father5 {
    // final method cannot be overridden
    final void Secbike() {
        System.out.println("BAJAJ NS 200 2019");
    }
}

class Son5 extends Father5 {
    void bike() {
        System.out.println("KTM 390");
    }
}