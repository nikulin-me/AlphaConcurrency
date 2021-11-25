package alpha.currency.controller;


import alpha.currency.service.sender.GifSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/currency")
public class GifController {
    private final GifSender gifSender;

    @Autowired
    public GifController(GifSender gifSender) {
        this.gifSender = gifSender;
    }


    @GetMapping
    public Object getGif(@RequestParam String currency) throws IOException {
        return gifSender.getGif(currency);
    }

}
