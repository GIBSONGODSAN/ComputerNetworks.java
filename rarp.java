import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class rarp {
    public static void main(String[] args) {
        Map<String, String> macToIpMap = new HashMap<>();
        macToIpMap.put("00:0A:95:9D:68:16", "192.168.1.1");
        macToIpMap.put("00:1B:44:11:3A:B7","192.168.1.2");
        macToIpMap.put("00:23:45:6C:8D:E9", "192.168.1.3");
        macToIpMap.put("00:3A:95:9D:68:16", "192.168.1.4");
        macToIpMap.put("00:4B:44:11:3A:B7", "192.168.1.5");
        macToIpMap.put("00:53:45:6C:8D:E9", "192.168.1.6");
        macToIpMap.put("00:6A:95:9D:68:16", "192.168.1.7");
        macToIpMap.put("00:7A:95:9D:68:16", "192.168.1.8");
        macToIpMap.put("00:8B:44:11:3A:B7", "192.168.1.9");
        macToIpMap.put("00:93:45:6C:8D:E9", "192.168.1.0");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Mac address to get its IP address:");
        String macAddress = scanner.nextLine();

        String ipAddress = macToIpMap.get(macAddress);
        if (macAddress != null) {
            System.out.println("IP Address for MAC " + macAddress + ": " + ipAddress);
        } else {
            System.out.println("IP Address not found for MAC " + macAddress);
        }
    }
}
