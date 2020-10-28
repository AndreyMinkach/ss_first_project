interface Calculator {
    public static double calculatePay(double hourlyPaid, int hoursWorked) {
        return hourlyPaid * hoursWorked;
    }

    public static double calculatePay(double fixedPaid) {
        return fixedPaid;
    }
}
