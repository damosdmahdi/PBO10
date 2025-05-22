class Animal {
    public void suara() {
        System.out.println("Cetak suara");
    }

    public void makan() {
        System.out.println("Hewan Makan");
    }
}

class Dog extends Animal {
    @Override
    public void suara() {
        System.out.println("GUK GUK GUK");
    }
}

public class Main {

    public static void main(String[] args) throws Exception {
        Animal a = new Animal();
        a.suara();
    }
}
