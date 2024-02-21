package Exercise2;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("BrayaCheat", "Normal");
        Customer customer2 = new Customer("MalisKheang", "Premium");
        Customer customer3 = new Customer("Borisak", "Gold");
        Customer customer4 = new Customer("Soledad", "Silver");

        Sale sale__customer1 = new Sale(customer1, "2023-06-18");
        Sale sale__customer2 = new Sale(customer2, "2023-07-22");
        Sale sale__customer3 = new Sale(customer3, "2023-08-12");
        Sale sale__customer4 = new Sale(customer4, "2023-09-07");

        sale__customer1.setProductExpense(100);
        sale__customer1.setServiceExpense(100);
        sale__customer1.displayInformation();

        sale__customer2.setProductExpense(100);
        sale__customer2.setServiceExpense(100);
        sale__customer2.displayInformation();

        sale__customer3.setProductExpense(100);
        sale__customer3.setServiceExpense(100);
        sale__customer3.displayInformation();

        sale__customer4.setProductExpense(100);
        sale__customer4.setServiceExpense(100);
        sale__customer4.displayInformation();
    }
}
