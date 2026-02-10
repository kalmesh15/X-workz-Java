class YouTube {
    public static void main(String[] args) {
        createAccount("Kalmesh Tech", "kalmesh@gmail.com");
    }

    public static void createAccount(String channelName, String email) {
        System.out.println("YouTube Channel Created: " + channelName);
        System.out.println("User email is " + email);
    }
}
