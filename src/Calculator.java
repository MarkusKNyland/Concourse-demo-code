
class Calculator{

    public void subtract() {
        System.out.println("-");
        System.out.println("Test");
        System.out.println("WOW");
    }

    public int renter(int lånesum, int terminBeløp) {
        int sum = 0;
        double rente= 0.023;
        int terminer = 0;

        while (lånesum > 0) {
            sum += (lånesum * rente) / 12;
            lånesum -= terminBeløp;
            terminer++;
        }

        System.out.println(terminer);
        return sum;
    }

    private void toD(){
        int[][] a ={{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("" + a[2][2]);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        System.out.println(calculator.renter(500000, 2300));
//        System.out.println("#######");
//        System.out.println(calculator.renter(500000, 3300));
//        System.out.println("#######");
//        System.out.println(calculator.renter(500000, 7900));
        calculator.toD();
    }
}