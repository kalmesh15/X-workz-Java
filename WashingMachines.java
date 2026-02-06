class WashingMachines {

    static String brand = "Samsung";
    static String capacity = "7 kilograms";
    static String color = "inox";
    static double price = 29490;
    static String manufacturer = "Samsung India Pvt ltd";
    static int rotationalSpeed = 1200;
    static String noiseLevel = "60 Decibles";
    static String voltage = "220 volts";
    static String doorOrientation = "Front-Load";
    static String certification = "Energy Star";

    public static void main(String[] a) {

        /*
        String brand ="Samsung";
        String capacity = "7 kilograms";
        String color ="inox";
        double price = 29490;
        String manufacturer = "Samsung India Pvt ltd";
        int rotationalSpeed=1200;
        String noiseLevel ="60 Decibles";
        String voltage = "220 volts";
        String doorOrientation ="Front-Load";
        String certification = "Energy Star";
        */

        System.out.println("The Brand anme is " + brand);
        System.out.println("It has capacity upto " + capacity);
        System.out.println("The color is " + color);
        System.out.println("The Price of the machine is " + price);
        System.out.println("The Manufacturer is " + manufacturer);
        System.out.println("It has rotational speed upto(RPM) " + rotationalSpeed);
        System.out.println("Its Noise level is " + noiseLevel);
        System.out.println("it need voltage of " + voltage);
        System.out.println("It has " + doorOrientation + " Door orientation");
        System.out.println("It is certified by " + certification);
    }
}
