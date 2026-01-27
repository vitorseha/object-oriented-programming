import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

import org.json.JSONArray;
import org.json.JSONObject;

//properties
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor

public class PersonService {

    private HttpClient client = HttpClient.newHttpClient();
    //private String url = "your url here";
    private final String url;

    public void list() throws Exception {

        HttpRequest req = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .GET()
            .build();

        var res = client.send(req, BodyHandlers.ofString());

        JSONArray items = new JSONArray(res.body());

        for (int i = 0; i < items.length(); i++) {
            JSONObject person = items.getJSONObject(i);

            System.out.println("ID: " + person.getInt("id"));
            System.out.println("Name: " + person.getString("name"));
            System.out.println("E-mail: " + person.getString("email"));
            System.out.println("**************************");
        }
    }
}
