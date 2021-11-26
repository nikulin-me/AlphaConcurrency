package alpha.currency.controller;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Test {
    public static void main(String[] args) throws Exception {

        String webPage = "https://api.giphy.com/v1/gifs/search?q=broke&api_key=Fg5ZichfqPaNaXtBRycoWr9bCoT7WtYR&limit=2";
        String s=("https://media4.giphy.com/media/YsTs5ltWtEhnq/giphy.gif?cid=790b761145e66c709e29f991b8627365e2a5a44350557489&rid=giphy.gif&ct=g");
        URL url=new URL(s);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try (InputStream inputStream = url.openStream()) {
            int n = 0;
            byte [] buffer = new byte[16565];
            while (-1 != (n = inputStream.read(buffer))) {
                output.write(buffer, 0, n);
            }
        }
        System.out.println(output);
    }
}
