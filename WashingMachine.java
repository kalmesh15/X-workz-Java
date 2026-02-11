class WashingMachine {

    static boolean isRunning;

    static boolean onOrOff() {

        if (isRunning == false) {
            isRunning = true;
            System.out.println("The Washing Machine is started...");
        } else {
            isRunning = false;
            System.out.println("The Washing Machine is stopped...");
        }
        return isRunning;
    }
}
