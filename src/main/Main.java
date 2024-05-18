import com.exchangeconverter.bashconverter.controller.ExchangeRateController;
import com.exchangeconverter.bashconverter.model.ExchangeRateApi;
import com.exchangeconverter.bashconverter.view.ConsoleView;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ExchangeRateApiWrapper exchangeRateApi = new ExchangeRateApiWrapper();
        ConsoleView consoleView = new ConsoleView();
        ExchangeRateController exchangeRateController = new ExchangeRateController(exchangeRateApi, consoleView);
        exchangeRateController.start();
    }

}
