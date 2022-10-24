package exception;

public class DomainException extends RuntimeException {

    private static final long serialVarsionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
    
}
