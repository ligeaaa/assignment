public class InsufficientBalanceException extends RuntimeException{

    private double detail;

    public InsufficientBalanceException() {
    }

    public InsufficientBalanceException(double a) {
        this.detail = a;
    }

    @Override
    public String toString() {
        return "InsufficientBalanceException{" +
                "detail=" + detail +
                '}';
    }
}
