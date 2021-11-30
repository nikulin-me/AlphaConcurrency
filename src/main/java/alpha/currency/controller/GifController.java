package alpha.currency.controller;

import alpha.currency.model.Datum;
import alpha.currency.service.gif.GifSender;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@Controller
@RequiredArgsConstructor
@Slf4j
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
    @GetMapping("/gif")
    public String getGif(@RequestParam("currency") String currency, Model model) throws MalformedURLException {
        URL url = new URL(gifSender.getGirUrlByCurrency(currency));
        model.addAttribute("url",url);
        log.info("Getting gif from controller");
        return "gif";
    }

    /**
     * @return json data gif
     */
    @GetMapping("/gif.json")
    @ResponseBody
    public Datum getGif(@RequestParam("currency") String currency) throws IOException {
        log.info("Getting gif.json from controller");
        return gifSender.getGifByCurrency(currency);
    }
}
