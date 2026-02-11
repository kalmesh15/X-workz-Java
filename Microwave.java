class Microwave {

    static boolean isHeating;

    static boolean onOrOff() {

        if (isHeating == false) {
            isHeating = true;
            System.out.println("The Microwave is heating...");
        } else {
            isHeating = false;
            System.out.println("The Microwave is turned off...");
        }
        return isHeating;
    }
}
