public class IPAddressValidator {
    public static boolean isValidIPv4(String ip) {
        if (ip == null || ip.isEmpty()) {
            return false;
        }
        
        String[] parts = ip.split("\\.");
        if (parts.length != 4) {
            return false;
        }
        
        for (String part : parts) {
            if (part.isEmpty() || part.length() > 3) {
                return false;
            }
            
            // Check if the part is numeric
            for (char c : part.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) {
                return false;
            }
            
            // Prevent leading zeros (except for "0" itself)
            if (part.length() > 1 && part.charAt(0) == '0') {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidIPv4("222.111.111.111")); // true
        System.out.println(isValidIPv4("5555..555")); // false
        System.out.println(isValidIPv4("0.0.0.255")); // true
        System.out.println(isValidIPv4("0.0.0.0255")); // false
    }
}