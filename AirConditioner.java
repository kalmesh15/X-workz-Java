class AirConditioner {

    static boolean isCooling;

    static boolean onOrOff() {

        if (isCooling == false) {
            isCooling = true;
            System.out.println("The AC is turned on...");
        } else {
            isCooling = false;
            System.out.println("The AC is turned off...");
        }
        return isCooling;
    }
}
