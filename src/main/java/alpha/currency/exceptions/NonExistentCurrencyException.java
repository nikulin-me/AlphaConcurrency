package alpha.currency.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NonExistentCurrencyException extends IllegalArgumentException{
    public NonExistentCurrencyException() {
        super();
    }
    public NonExistentCurrencyException(String message) {
        super(message);
    }

    public NonExistentCurrencyException(String message,Throwable cause){
        super(message,cause);
    }

}
