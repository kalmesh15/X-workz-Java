class IronBox {

    static boolean isHeating;

    static boolean onOrOff() {

        if (isHeating == false) {
            isHeating = true;
            System.out.println("The Iron Box is heating...");
        } else {
            isHeating = false;
            System.out.println("The Iron Box is turned off...");
        }
        return isHeating;
    }
}
