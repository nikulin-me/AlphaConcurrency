package alpha.currency.controller;

import alpha.currency.model.Gif;
import alpha.currency.service.collector.GifService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GifController {
    private final GifService gifService;

    @Value("${acc-key.giphy}")
    private String appId;

    @GetMapping("/gif")
    public Gif getGif(@RequestParam("q") String q){
        return gifService.getGif(appId,q);
    }

}
