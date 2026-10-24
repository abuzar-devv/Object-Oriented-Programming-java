public class UniversityFeeBalance {

    String name;
    private double total_fee;
    private double fee_paid;
    private boolean isValid = false;

    UniversityFeeBalance() {
        name = null;
        total_fee = 0;
        fee_paid = 0;
    }

    UniversityFeeBalance(String name, double total_fee, double fee_paid) {
        this.name = name;

        if ((total_fee >= fee_paid) && (total_fee >= 0) && (fee_paid >= 0)) {

            this.total_fee = total_fee;
            this.fee_paid = fee_paid;
            isValid = true;

        } else {
            System.out.println("Invalid arguments");
        }
    }

    void fee_pending() {

        if (isValid) { // Modified
            System.out.println("Fee pending:" + (total_fee - fee_paid));
        } else {
            System.out.println("Calculation didn't execute as input is faulty");
        }
    }
}

class MainRun {
    public static void main(String[] args) {

        UniversityFeeBalance s1 = new UniversityFeeBalance();
        UniversityFeeBalance s2 = new UniversityFeeBalance("Abuzar", 1000, 200);

        s1.fee_pending();
        s2.fee_pending();
    }
}