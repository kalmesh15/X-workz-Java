class RailwayStation {
    public static void main(String[] args) {

        String stationName = "Hassan Junction";
        String zone = "South Western Railway";
        int totalPlatforms = 3;

        String[] trains = {"Mysuru Express", "Shatabdi", "Intercity", "Hampi Express"};
        String[] facilities = {"Waiting Hall", "Rest Rooms", "Food Stall", "ATM"};
        String[] arrivalTimes = {"6:15 AM", "10:45 AM", "3:30 PM", "9:00 PM"};

        System.out.println("Station Name: " + stationName);
        System.out.println("Railway Zone: " + zone);
        System.out.println("Platforms: " + totalPlatforms);

        System.out.println("Trains");
        for (String t : trains) {
            System.out.println(t);
        }

        System.out.println("Facilities");
        for (String f : facilities) {
            System.out.println(f);
        }

        System.out.println("Arrival Times");
        for (String time : arrivalTimes) {
            System.out.println(time);
        }
    }
}
