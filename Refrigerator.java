class Refrigerator {

    static boolean isActive;

    static boolean onOrOff() {

        if (isActive == false) {
            isActive = true;
            System.out.println("The Refrigerator is cooling...");
        } else {
            isActive = false;
            System.out.println("The Refrigerator is turned off...");
        }
        return isActive;
    }
}
