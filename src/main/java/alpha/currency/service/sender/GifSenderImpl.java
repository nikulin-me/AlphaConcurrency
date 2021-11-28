package alpha.currency.service.sender;

import alpha.currency.model.Datum;
import alpha.currency.model.Gif;
import alpha.currency.service.collector.GifService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class GifSenderImpl implements GifSender {
    private final GifService gifService;

    @Override
    public String getGifByCurrency(String appId, String currency) {
        Random random = new Random();
        Gif gif = gifService.getGif(appId,currency);
        List<Datum> data = gif.getData();
        Datum datum = data.get(random.nextInt(data.size()));
        System.out.println(Arrays.toString(datum.getImages().getOriginal().getUrl().getBytes(StandardCharsets.UTF_8)));
        return datum.getImages().getOriginal().getUrl();
    }
}
