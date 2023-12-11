public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Colum", "123");
        employee1.getReportDetails();

        ShiftWorker worker1 = new ShiftWorker("Colum", 123, 1, 11.70, "123abc");
        worker1.getReportDetails();

    }
}
