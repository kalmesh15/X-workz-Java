class AirportTerminal {
    public static void main(String[] args) {

        String airportName = "Kempegowda International Airport";
        String terminal = "Terminal 2";
        int totalGates = 25;
        boolean internationalFlights = true;

        String[] airlines = {"IndiGo", "Air India", "Vistara", "Emirates"};
        String[] facilities = {"Lounge", "Duty Free", "Food Court", "WiFi"};
        String[] peakHours = {"6 AM", "10 AM", "6 PM", "9 PM"};

        System.out.println("Airport: " + airportName);
        System.out.println("Terminal: " + terminal);
        System.out.println("Total Gates: " + totalGates);
        System.out.println("International Flights: " + internationalFlights);

        System.out.println("Airlines");
        for (String airline : airlines) {
            System.out.println(airline);
        }

        System.out.println("Facilities");
        for (String facility : facilities) {
            System.out.println(facility);
        }

        System.out.println("Peak Hours");
        for (String hour : peakHours) {
            System.out.println(hour);
        }
    }
}
