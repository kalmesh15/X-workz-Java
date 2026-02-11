class Printer {

    static boolean isPrinting;

    static boolean onOrOff() {

        if (isPrinting == false) {
            isPrinting = true;
            System.out.println("The Printer is ready...");
        } else {
            isPrinting = false;
            System.out.println("The Printer is turned off...");
        }
        return isPrinting;
    }
}
