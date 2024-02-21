package Exercise2;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("BrayaCheat", "Normal");
        Customer c2 = new Customer("MalisKheang", "Premium");
        Customer c3 = new Customer("Borisak", "Gold");
        Customer c4 = new Customer("Soledad", "Silver");

        Sale sale_c1 = new Sale(c1, "2023-06-18");
        Sale sale_c2 = new Sale(c2, "2023-07-22");
        Sale sale_c3 = new Sale(c3, "2023-08-12");
        Sale sale_c4 = new Sale(c4, "2023-09-07");

        sale_c1.setProductExpense(100);
        sale_c1.setServiceExpense(100);
        sale_c1.displayInfo();

        sale_c2.setProductExpense(100);
        sale_c2.setServiceExpense(100);
        sale_c2.displayInfo();

        sale_c3.setProductExpense(100);
        sale_c3.setServiceExpense(100);
        sale_c3.displayInfo();

        sale_c4.setProductExpense(100);
        sale_c4.setServiceExpense(100);
        sale_c4.displayInfo();
    }
}
