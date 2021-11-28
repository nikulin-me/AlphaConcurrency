package alpha.currency.controller;

import alpha.currency.service.sender.GifSender;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@RestController
@RequiredArgsConstructor
public class GifController {
    private final GifSender gifSender;

    @Value("${acc-key.giphy}")
    private String appId;

    @GetMapping(value = "/gif/{currency}")
    public ResponseEntity<Image> getGif(@PathVariable("currency") String currency) throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);
/*
        byte[] image=gifSender.getGifByCurrency(appId,currency);

*/
        URL url=new URL(gifSender.getGifByCurrency(appId,currency));
        BufferedImage image = ImageIO.read(url);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        return ResponseEntity.ok()
                .contentType(MediaType.valueOf(MediaType.IMAGE_GIF_VALUE)).body(image);
    }


}
/*@RequestMapping(value = "/Image/{id:.+}", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE)
public ResponseEntity<byte[]> getImage(@PathVariable("id")String id, HttpServletResponse response) {
    byte[] image = imageService.getImage(id);  //this just gets the data from a database
    response.setContentType(MediaType.IMAGE_JPEG_VALUE);
    return ResponseEntity.ok(image);
}*/

/**/