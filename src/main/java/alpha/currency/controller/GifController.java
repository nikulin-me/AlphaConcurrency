package alpha.currency.controller;

import alpha.currency.model.Datum;
import alpha.currency.service.gif.GifSender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@Controller
@RequiredArgsConstructor
public class GifController {
    private final GifSender gifSender;

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



    /**
     * @return gif html depending on delta
     * Not rest because method above send image, not gif that`s why using this
     * Method below return json gif
     */
    @GetMapping("/gif/{currency}")
    public String getGif(@PathVariable("currency") String currency, Model model) throws MalformedURLException {
        URL url = new URL(gifSender.getGirUrlByCurrency(currency));
        model.addAttribute("url",url);
        return "gif";
    }

    /**
     * @return json data gif
     */
    @GetMapping("/gif/{currency}/json")
    @ResponseBody
    public Datum getGif(@PathVariable("currency") String currency) throws IOException {
        return gifSender.getGifByCurrency(currency);
    }
}
