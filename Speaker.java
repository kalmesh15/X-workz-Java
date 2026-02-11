class Speaker {

    static boolean isPlaying;

    static boolean onOrOff() {

        if (isPlaying == false) {
            isPlaying = true;
            System.out.println("The Speaker is playing...");
        } else {
            isPlaying = false;
            System.out.println("The Speaker is stopped...");
        }
        return isPlaying;
    }
}
