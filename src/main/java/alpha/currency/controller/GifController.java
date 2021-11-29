package alpha.currency.controller;

import alpha.currency.service.gif.GifSender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.view.RedirectView;

import java.io.*;
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


    //Not rest because method above send image, not gif

    /**
     * @return gif depending on delta
     */
    @GetMapping("/gif/{currency}")
    public String getGif(@PathVariable("currency") String currency, Model model) throws MalformedURLException {
        URL url = new URL(gifSender.getGifByCurrency(currency));
        model.addAttribute("url",url);
        return "gif";
    }

    /*@GetMapping("/gif/{currency}/r")
    public RedirectView getGif(@PathVariable("currency") String currency) throws IOException {
        URL url = new URL(gifSender.getGifByCurrency(currency));
        InputStream inputStream = url.openStream();
        byte[] bytes=new byte[999999];
        int length;
        OutputStream outputStream=new ByteArrayOutputStream();
        while ((length = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, length);   // Will write data to file byte by byte of size 2048
        }
        return new RedirectView(gifSender.getGifByCurrency(currency));
    }*/
}
