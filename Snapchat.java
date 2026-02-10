class Snapchat {
    public static void main(String[] args) {
        createAccount("kalmesh_snap", "Snap@123", 21);
    }

    public static void createAccount(String username, String password, int age) {
        System.out.println("Snapchat Account Created for " + username);
        System.out.println("User password is " + password);
        System.out.println("User age is " + age);
    }
}
