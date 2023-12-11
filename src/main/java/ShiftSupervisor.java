public class ShiftSupervisor extends ShiftWorker {

    private double annualSalary;

    public ShiftSupervisor(){
        this.annualSalary = 0;
    }

    public ShiftSupervisor(String name, int payNum, int shift, String userID, double annualSalary){
        super(name, payNum, shift);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void getReportDetails(){
        System.out.println("Name: " + getName() + "\n" + "Payroll Number: " + getPayNum() + "\n" + "Shift: " + getShift() + "\n" + "Annual Salary: " + annualSalary);
    }
}
