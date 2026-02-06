class BankBranch {
    public static void main(String[] args) {

        String bankName = "State Bank of India";
        String branch = "Main Branch";
        
        String[] services = {"Savings Account", "Loans", "FD", "Net Banking"};
        String[] counters = {"Cash Counter", "Loan Desk", "Help Desk"};
        String[] workingHours = {"10 AM", "4 PM"};

        System.out.println("Bank: " + bankName);
        System.out.println("Branch: " + branch);
        

        System.out.println("Services");
        for (String s : services) {
            System.out.println(s);
        }

        System.out.println("Counters");
        for (String c : counters) {
            System.out.println(c);
        }

        System.out.println("Working Hours");
        for (String hour : workingHours) {
            System.out.println(hour);
        }
    }
}
