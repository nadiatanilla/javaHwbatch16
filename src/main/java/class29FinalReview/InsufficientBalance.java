package class29FinalReview;

// this exception is thrown when there is no enough balance in the users account and try to withdraw more money
public class InsufficientBalance extends RuntimeException {
    public InsufficientBalance(String errorMsg){
        super(errorMsg);

    }

}
