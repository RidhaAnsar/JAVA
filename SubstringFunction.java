public class SubstringFunction {
    public static String substring(String str, int beginIndex) {
        return str.substring(beginIndex);
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = substring(str, 2);
        System.out.println("Substring from index 2: " + substr); // Output: "llo, World!"
    }
}
