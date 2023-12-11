public class EmployeeApp {
    public static void main(String[] args) {
        System.out.println("---Employee Details---");
        Employee employee1 = new Employee("Colum", "123");
        employee1.getReportDetails();
        System.out.println("\n");

        ShiftWorker worker1 = new ShiftWorker("Colum", 123, 1, 11.70, "123ABC");
        worker1.getReportDetails();
        System.out.println("\n");

        ShiftSupervisor supervisor1 = new ShiftSupervisor("Bob", 456, 2, "456DEF", 44500);
        supervisor1.getReportDetails();

    }
}
