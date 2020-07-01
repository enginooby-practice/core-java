public class
PrimitiveTypes {
    public static void main(String[] args) {
        int maxIntValue = Integer.MAX_VALUE;
        int minIntValue = Integer.MIN_VALUE;

        System.out.println("Max int value: " + maxIntValue);
        System.out.println("Min int value: " + minIntValue);
        System.out.println("Overflow: " + (maxIntValue + 1));
        System.out.println("Underflow: " + (minIntValue - 1));

        //underscore integer is supported by JDK 7 above
        int num = 123_234_123;
        System.out.println(num);
    }
}
