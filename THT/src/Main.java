public class Main {

    // Superclass
    static class Employee {
        protected String name;

        public Employee(String name) {
            this.name = name;
        }

        public double calculateSalary() {
            return 0;
        }

        public double calculateSalary(boolean withBonus) {
            return 0;
        }

        public void showInfo() {
            System.out.println("Nama: " + name);
        }
    }

    // Subclass Software Engineer
    static class SoftwareEngineer extends Employee {
        public SoftwareEngineer(String name) {
            super(name);
        }

        @Override
        public double calculateSalary() {
            return 8000000;
        }

        @Override
        public double calculateSalary(boolean withBonus) {
            if (withBonus) {
                return 8000000 + 1000000;
            } else {
                return 8000000;
            }
        }

        @Override
        public void showInfo() {
            System.out.println("Software Engineer - " + name);
        }
    }

    // Subclass Data Scientist
    static class DataScientist extends Employee {
        public DataScientist(String name) {
            super(name);
        }

        @Override
        public double calculateSalary() {
            return 10000000;
        }

        @Override
        public double calculateSalary(boolean withBonus) {
            if (withBonus) {
                return 10000000 + 2000000;
            } else {
                return 10000000;
            }
        }

        @Override
        public void showInfo() {
            System.out.println("Data Scientist - " + name);
        }
    }

    // Subclass Intern
    static class Intern extends Employee {
        public Intern(String name) {
            super(name);
        }

        @Override
        public double calculateSalary() {
            return 2000000;
        }

        @Override
        public double calculateSalary(boolean withBonus) {
            if (withBonus) {
                return 2000000 + 500000;
            } else {
                return 2000000;
            }
        }

        @Override
        public void showInfo() {
            System.out.println("Intern - " + name);
        }
    }

    public static void main(String[] args) {
        Employee[] karyawan = new Employee[3];
        karyawan[0] = new SoftwareEngineer("Dani");
        karyawan[1] = new DataScientist("Salsa");
        karyawan[2] = new Intern("Adit");

        // Polymorphism
        for (int i = 0; i < karyawan.length; i++) {
            karyawan[i].showInfo();
            double gaji = karyawan[i].calculateSalary();
            System.out.println("Gaji Bulanan: Rp " + gaji);
            System.out.println("--------------------------");
        }

        // Memanggil overloading method (langsung ke objek)
        System.out.println("=== Gaji dengan Bonus ===");
        System.out.println("Bonus SE: Rp " + ((SoftwareEngineer) karyawan[0]).calculateSalary(true));
        System.out.println("Bonus DS: Rp " + ((DataScientist) karyawan[1]).calculateSalary(true));
        System.out.println("Bonus Intern: Rp " + ((Intern) karyawan[2]).calculateSalary(true));
    }
}
