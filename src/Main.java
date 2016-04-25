public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        Movie movie01 = new Movie("The Revenant", 1);
        Movie movie02 = new Movie("Terminator", 0);
        Rental rental01 = new Rental(movie01, 2);
        Rental rental02 = new Rental(movie02, 2);
        customer.addRental(rental01);
        customer.addRental(rental02);
        System.out.println (customer.statement());
    }
}
