package alpha.currency.controller;


import alpha.currency.service.sender.GifSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/currency")
public class GifController {
    private final GifSender gifSender;

    @Autowired
    public GifController(GifSender gifSender) {
        this.gifSender = gifSender;
    }


    @GetMapping(consumes = MediaType.ALL_VALUE)
    public String getGifUrl(@RequestParam String currency) throws Exception {
        return gifSender.getGifURLDependingDelta(currency);
    }

    @GetMapping(value = "/r",consumes = MediaType.ALL_VALUE)
    public byte[] getGif(@RequestParam String currency) throws IOException {
        return gifSender.getGif(currency);
    }

    @GetMapping(value = "/a", consumes = MediaType.ALL_VALUE)
    public ResponseEntity<byte[]> getImage(@RequestParam String currency, HttpServletResponse response) throws Exception {
        byte[] image = gifSender.getGif(currency);
        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
        return ResponseEntity.ok(image);
    }
    @RequestMapping(value = "/i", method = RequestMethod.GET)
    public ResponseEntity<byte[]> getImage(@RequestParam String currency) throws IOException {
        byte[] image = gifSender.getGif(currency);
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image);
    }

}
