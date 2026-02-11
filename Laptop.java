class Laptop {

    static boolean isPowered;

    static boolean onOrOff() {

        if (isPowered == false) {
            isPowered = true;
            System.out.println("The Laptop is starting...");
        } else {
            isPowered = false;
            System.out.println("The Laptop is shutting down...");
        }
        return isPowered;
    }
}
