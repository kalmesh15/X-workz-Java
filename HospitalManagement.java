class HospitalManagement {
    public static void main(String[] args) {

        String hospitalName = "City Care Hospital";
        String location = "Shimoga";
        int totalBeds = 250;
        

        String[] departments = {"Cardiology", "Orthopedics", "Neurology", "Pediatrics"};
        String[] doctors = {"Dr. Rao", "Dr. Mehta", "Dr. Sharma"};
        String[] visitingHours = {"9 AM", "1 PM", "5 PM"};

        System.out.println("Hospital: " + hospitalName);
        System.out.println("Location: " + location);
        System.out.println("Beds: " + totalBeds);

        System.out.println("Departments");
        for (String d : departments) {
            System.out.println(d);
        }

        System.out.println("Doctors");
        for (String doc : doctors) {
            System.out.println(doc);
        }

        System.out.println("Visiting Hours");
        for (String hour : visitingHours) {
            System.out.println(hour);
        }
    }
}
