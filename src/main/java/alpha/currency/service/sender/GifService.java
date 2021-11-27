package alpha.currency.service.sender;

import alpha.currency.feign.GifClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GifService {
    private final GifClient gifClient;


    public List<Object> getGifList(String currency){
        return gifClient.getGifList(currency);
    }
}
