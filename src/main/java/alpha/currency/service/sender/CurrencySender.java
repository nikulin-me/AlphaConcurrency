package alpha.currency.service.sender;

import alpha.currency.model.Gif;

import java.io.IOException;

public interface CurrencySender {
    boolean amIRich(String appId,String currency);
}
