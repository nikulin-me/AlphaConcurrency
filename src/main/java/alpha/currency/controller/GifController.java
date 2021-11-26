package alpha.currency.controller;


import alpha.currency.service.sender.GifSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequestMapping("/currency")
public class GifController {
    private final GifSender gifSender;

    @Autowired
    public GifController(GifSender gifSender) {
        this.gifSender = gifSender;
    }


    @GetMapping("/ap")
    public Object getGif(@RequestParam String currency) throws Exception {
        return gifSender.getGifURL(currency);
    }

    @GetMapping(value = "/r", consumes = MediaType.ALL_VALUE)
    public ResponseEntity<byte[]> getImage(@RequestParam String currency, HttpServletResponse response) throws Exception {
        byte[] image = gifSender.getGif(currency);
        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
        return ResponseEntity.ok(image);
    }

    @GetMapping(consumes = MediaType.ALL_VALUE)
    public ResponseEntity<ByteArrayResource> image(@RequestParam String currency) throws IOException {
        final ByteArrayResource inputStream = new ByteArrayResource(Files.readAllBytes(Paths.get(
                gifSender.getGifURL(currency)
        )));
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentLength(inputStream.contentLength())
                .body(inputStream);

    }
}
