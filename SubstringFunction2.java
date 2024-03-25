public class SubstringFunction2 {
    public static String substring(String str, int beginIndex, int endIndex) {
        return str.substring(beginIndex, endIndex);
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = substring(str, 2, 7);
        System.out.println("Substring from index 2 to 7: " + substr); // Output: "llo, "
    }
}
