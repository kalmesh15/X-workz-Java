class OnlineGamingZone {
    public static void main(String[] args) {

        String zoneName = "GameHub Arena";
        String city = "Mysore";
        int totalConsoles = 20;
        int hourlyCharge = 120;

        String[] gamesAvailable = {"FIFA", "GTA V", "Call of Duty", "PUBG"};
        String[] consoles = {"PlayStation", "Xbox", "PC"};
        

        System.out.println("Gaming Zone: " + zoneName);
        System.out.println("City: " + city);
        System.out.println("Consoles Count: " + totalConsoles);
        System.out.println("Hourly Charge: " + hourlyCharge);

        System.out.println("Games Available");
        for (String game : gamesAvailable) {
            System.out.println(game);
        }

        System.out.println("Console Types");
        for (String console : consoles) {
            System.out.println(console);
        }

    }
}
