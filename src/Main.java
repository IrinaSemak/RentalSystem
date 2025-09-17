import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalSystem system = new RentalSystem();
        Scanner scanner = new Scanner(System.in);

        Apartment apt1 = new Apartment(1, "123 Main St", 500.0, 50.0);
        Tenant tenant1 = new Tenant(1, "John Doe", "john@example.com");
        Contract contract1 = new Contract(1, apt1, tenant1, 12);
        system.addApartment(apt1); system.addTenant(tenant1); system.addContract(contract1);

        while (true) {
            System.out.println("\n1. Найти квартиры по цене");
            System.out.println("2. Фильтровать арендаторов по сроку договора");
            System.out.println("3. Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Введите максимальную цену: ");
                double maxPrice = scanner.nextDouble();
                List<Apartment> apartments = system.findApartmentsByPrice(maxPrice);
                System.out.println("Найдено квартир: " + apartments);
            } else if (choice == 2) {
                System.out.print("Введите минимальный срок договора (месяцы): ");
                int minDuration = scanner.nextInt();
                List<Tenant> tenants = system.filterTenantsByContractDuration(minDuration);
                System.out.println("Арендаторы с договором >= " + minDuration + " месяцев: " + tenants);
            } else if (choice == 3) break;
        }
        scanner.close();
    }
}