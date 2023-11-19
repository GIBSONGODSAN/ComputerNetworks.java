import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class arp {
    public static void main(String[] args) {
        Map<String, String> ipToMacMap = new HashMap<>();
        ipToMacMap.put("192.168.1.1", "00:0A:95:9D:68:16");
        ipToMacMap.put("192.168.1.2", "00:1B:44:11:3A:B7");
        ipToMacMap.put("192.168.1.3", "00:23:45:6C:8D:E9");
        ipToMacMap.put("192.168.1.4", "00:3A:95:9D:68:16");
        ipToMacMap.put("192.168.1.5", "00:4B:44:11:3A:B7");
        ipToMacMap.put("192.168.1.6", "00:53:45:6C:8D:E9");
        ipToMacMap.put("192.168.1.7", "00:6A:95:9D:68:16");
        ipToMacMap.put("192.168.1.8", "00:7A:95:9D:68:16");
        ipToMacMap.put("192.168.1.9", "00:8B:44:11:3A:B7");
        ipToMacMap.put("192.168.1.0", "00:93:45:6C:8D:E9");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an IP address to get its MAC address:");
        String ipAddress = scanner.nextLine();

        String macAddress = ipToMacMap.get(ipAddress);
        if (macAddress != null) {
            System.out.println("MAC Address for IP " + ipAddress + ": " + macAddress);
        } else {
            System.out.println("MAC Address not found for IP " + ipAddress);
        }
    }
}
