class Animal {
    static void suara() {
        System.out.println("suara Hewan");
    }

    void makan() {
        System.out.println("hewan makan");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Animal a = new Animal();
        Animal.suara();

        a.makan();
    }
}
