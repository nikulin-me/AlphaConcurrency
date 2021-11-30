package alpha.currency.controller;

import alpha.currency.model.Datum;
import alpha.currency.service.gif.GifSender;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class GifControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GifSender gifSender;


    @Test
    void getGif() throws Exception {
        Datum datum = new Datum();
        when(gifSender.getGifByCurrency("RUB"))
                .thenReturn(new Datum());
        mockMvc.perform(get("/gif.json?currency=RUB"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().contentType("application/json"))
                .andExpect(content().json(convertObjectToJsonString(datum)));

    }
    private String convertObjectToJsonString(Datum datum) {
        return new Gson().toJson(datum);
    }
}