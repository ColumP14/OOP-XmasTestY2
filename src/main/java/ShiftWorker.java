public class ShiftWorker extends Employee{
    private int shift;
    private int payNum;
    private double ratePay;

    public ShiftWorker(){
        this.shift = 0;
        this.payNum = 0;
        this.ratePay =0;
    }

    public ShiftWorker(String name, int payNum, int shift, double ratePay, String userID){
        super(name, userID);
        this.shift = shift;
        this.payNum = payNum;
        this.ratePay = ratePay;
    }

    public ShiftWorker(String name, int payNum, int shift){
        super(name);
        this.shift = shift;
        this.payNum = payNum;
        this.ratePay = ratePay;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getPayNum() {
        return payNum;
    }

    public void setPayNum(int payNum) {
        this.payNum = payNum;
    }

    public double getRatePay() {
        return ratePay;
    }

    public void setRatePay(double ratePay) {
        this.ratePay = ratePay;
    }

    public void getReportDetails(){
        System.out.println("Name: " + getName() + "\n" + "Payroll Number: " + payNum + "\n" + "Shift: " + shift + "\n" + "Hourly Pay: " + ratePay);
    }
}
