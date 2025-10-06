import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

//Вариант 4. Практическое задание 4. Необходимо сделать “GET” запрос на указанный адрес и обработать ответ.
//Вывести только допустимые типы ответа (поле “Host”) из заголовков (запрос выполняется по адресу “https://httpbin.org/anything”).
public class Prac4 {
    public static void main(String[] args) {
        try(HttpClient client = HttpClient.newHttpClient()){
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://httpbin.org/anything"))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, Object> body = objectMapper.readValue(response.body(), new TypeReference<>(){});
            Map<String, Object> headers = (Map<String, Object>) body.get("headers");
            System.out.println("Значение хоста сервера (поле “Host”): " + headers.get("Host"));
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
