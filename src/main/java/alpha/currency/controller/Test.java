package alpha.currency.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Test {
    public static void main(String[] args) throws Exception {
        String json=(" {\n" +
                "    \"userId\": 1,\n" +
                "    \"id\": 1,\n" +
                "    \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n" +
                "    \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
                "  }");

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson=gsonBuilder.create();
        User user = gson.fromJson(json, User.class);
        System.out.println(user.getUserId());
    }
    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }
}
