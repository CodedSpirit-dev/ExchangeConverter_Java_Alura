import exchangeconverter.model.UrlApi;

public class Main {
    public static void main(String[] args) {
        UrlApi urlApi = new UrlApi();

        urlApi.printApiUrl(urlApi.buildUrlWithApiKey());
    }

}
