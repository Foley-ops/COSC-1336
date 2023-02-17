public class DemoSalesperson {
    public static void main(String[] args) {
        Salesperson[] salespersons = new Salesperson[10];

        for (int i = 0; i < salespersons.length; i++) {
            salespersons[i] = new Salesperson(9999, 0.0);
        }

        for (int i = 0; i < salespersons.length; i++) {
            System.out.println("Salesperson #" + i + ": ID = " + salespersons[i].getId() + ", sales = " + salespersons[i].getSales());
        }
    }
}
