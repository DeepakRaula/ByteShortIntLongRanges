public class Main {
    public static void main(String[] args) {


        // byte 2^8

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Min value = " +minByteValue);
        System.out.println("Byte Max value = " +maxByteValue);

        // short 2^16

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        System.out.println("Short Min value = " +minShortValue);
        System.out.println("Short Max value = " +maxShortValue);

        // int 2^32

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer min value = " +minIntValue);
        System.out.println("Integer max value = " +maxIntValue);

        // under flow from min value
        System.out.println("Busted min value =" +(minIntValue - 1));

        // overflow from max value
        System.out.println("Busted max value =" +(maxIntValue + 1));

        // long 2^64

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;

        System.out.println("Long Min value = " +minLongValue);
        System.out.println("Long Max value = " +maxLongValue);


        //casting

        byte myTotal = (byte)(minByteValue/2);
        System.out.println(myTotal);



    }
}