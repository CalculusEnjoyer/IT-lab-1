package mo.kravchuk.webs.rest.exceptions;

public class ApiException extends RuntimeException {
    public ApiException(ErrorCode errorCode) {
        super(errorCode.getData());
    }
}
