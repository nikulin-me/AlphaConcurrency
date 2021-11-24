package alpha.currency.controller;


import alpha.currency.service.currency.CurrencySender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/currency")
public class GifController {
    private final CurrencySender currencySender;

    @Autowired
    public GifController(CurrencySender currencySender) {
        this.currencySender = currencySender;
    }


    @GetMapping
    public Object getGif(@RequestParam String value) throws IOException {
        return currencySender.amIRich(value);
    }
}
