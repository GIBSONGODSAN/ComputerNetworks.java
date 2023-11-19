import java.net.*;
import java.util.Scanner;

public class dns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. DNS Lookup");
        System.out.println("2. Reverse DNS Lookup");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        try {
            if (choice == 1) {
                System.out.print("Enter a domain name for DNS lookup: ");
                String host = scanner.nextLine();

                InetAddress address = InetAddress.getByName(host);

                System.out.println("DNS Lookup: " + host);
                System.out.println("IP Address: " + address.getHostAddress());
            } else if (choice == 2) {
                System.out.print("Enter an IP address for reverse DNS lookup: ");
                String ipAddress = scanner.nextLine();

                InetAddress address = InetAddress.getByName(ipAddress);

                System.out.println("Reverse DNS Lookup: " + ipAddress);
                System.out.println("Host Name: " + address.getHostName());
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
