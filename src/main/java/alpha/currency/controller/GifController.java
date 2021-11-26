package alpha.currency.controller;


import alpha.currency.service.sender.GifSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
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


    @GetMapping(produces = {MediaType.IMAGE_JPEG_VALUE,MediaType.IMAGE_GIF_VALUE,MediaType.IMAGE_PNG_VALUE})
    public String getGifUrl(@RequestParam String currency) throws Exception {
        return gifSender.getGifURLDependingDelta(currency);
    }

    @GetMapping(value = "/image", produces = {MediaType.IMAGE_JPEG_VALUE,MediaType.IMAGE_GIF_VALUE,MediaType.IMAGE_PNG_VALUE})
    public @ResponseBody
    byte[] getImage(@RequestParam String currency) throws IOException {
        byte[] image = gifSender.getGif(currency); //this just gets the data from a database
        return image;
    }

    @GetMapping(value = "/i", produces = {MediaType.IMAGE_JPEG_VALUE,MediaType.IMAGE_GIF_VALUE,MediaType.IMAGE_PNG_VALUE})
    public @ResponseBody
    ResponseEntity<byte[]> getImage(@RequestParam String currency,HttpServletResponse response) throws IOException {
        byte[] image = gifSender.getGif(currency); //this just gets the data from a database
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(MediaType.IMAGE_JPEG_VALUE))
                .body(image);
    }

    @GetMapping(value = "/k")
    public ResponseEntity<byte[]> download(@RequestParam String  currency) throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);
        return new ResponseEntity<>(gifSender.getGif(currency), headers, HttpStatus.OK);
    }
}
