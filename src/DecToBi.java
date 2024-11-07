public class DecToBi {

    public static String toBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 25; // Example
        String binaryResult = toBinary(decimalNumber);
        System.out.println("Binary representation of " + decimalNumber + " is: " + binaryResult);
    }
}