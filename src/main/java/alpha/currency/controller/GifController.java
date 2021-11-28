package alpha.currency.controller;

import alpha.currency.service.gif.GifSender;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.net.MalformedURLException;
import java.net.URL;

@Controller
@RequiredArgsConstructor
public class GifController {
    private final GifSender gifSender;

    @Value("${acc-key.giphy}")
    private String appId;
    /*
    @GetMapping(value = "/gif/{currency}")
    public ResponseEntity<byte[]> getGif(@PathVariable("currency") String currency) throws IOException {
        String file = new URL(gifSender.getGifByCurrency(appId, currency)).getFile();
        System.out.println(file);
        URL url = new URL(gifSender.getGifByCurrency(appId, currency));

        return ResponseEntity.ok()
                .contentType(MediaType.valueOf(IMAGE_GIF_VALUE))
                .body(IOUtils.toByteArray(url.openStream()));
    }*/


    //Not rest because method above send image, not gif
    @GetMapping("/gif/{currency}")
    public String getGif(@PathVariable("currency") String currency, Model model) throws MalformedURLException {
        URL url = new URL(gifSender.getGifByCurrency(appId, currency));
        model.addAttribute("url",url);
        return "gif";
    }
}
