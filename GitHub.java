class GitHub {
    public static void main(String[] args) {
        createAccount("kalmeshDev", "kalmesh@gmail.com", "Java, Spring Boot");
    }

    public static void createAccount(String username, String email, String skills) {
        System.out.println("GitHub Account Created for " + username);
        System.out.println("User email is " + email);
        System.out.println("User skills are " + skills);
    }
}
