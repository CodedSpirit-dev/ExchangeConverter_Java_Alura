# Exchange Rate Converter

## Overview
The Exchange Rate Converter is a Java-based application designed to facilitate currency conversions using real-time exchange rates obtained from the ExchangeRate-API. It supports a variety of currency pairs and offers a user-friendly console interface for easy interaction.

## Key Features
- **Currency Conversion**: Supports multiple currency pairs for conversion, including but not limited to:
    - USD ↔ ARS (Argentine Peso)
    - USD ↔ BRL (Brazilian Real)
    - USD ↔ MXN (Mexican Peso)
    - USD ↔ COP (Colombian Peso)
- **Real-time Data**: Utilizes real-time exchange rate data directly from the ExchangeRate-API.
- **User Interface**: Provides a straightforward console-based interface for user interactions, making currency conversions accessible to all users.

## Prerequisites
Before running the application, ensure you have the following:
- Java JDK 11 or higher installed on your system.
- An active internet connection to fetch the latest exchange rates.

## Getting Started
To set up and run the Exchange Rate Converter, follow these steps:
1. Clone the repository to your local machine.
2. Open the project in an Integrated Development Environment (IDE) such as IntelliJ IDEA or Eclipse.
3. Verify that the JDK is correctly configured in your IDE.
4. Navigate to `src/main/Main.java`, which serves as the entry point of the application.
5. Execute `Main.java` to launch the application.
6. Follow the prompts displayed in the console to perform currency conversions.

## Project Structure
The application is organized into several packages, each serving a specific purpose:
- `src/main/Main.java`: The main entry point of the application.
- `src/exchangeconverter/model`: Contains model classes such as `ConversionTarget` and `ExchangeRateApiResponse` for representing currency pairs and API responses.
- `src/exchangeconverter/service`: Includes the `ApiConsumer` class responsible for making HTTP requests to the ExchangeRate-API.
- `src/exchangeconverter/controller`: Features the `ExchangeRateController` class, which orchestrates the flow of data for currency conversion operations.
- `src/exchangeconverter/view`: Houses the `ConsoleView` class for managing user interface interactions.

## External API
This application leverages the ExchangeRate-API to obtain up-to-date currency exchange rates. For additional details about the API, visit [ExchangeRate-API](https://www.exchangerate-api.com/).

## License
The Exchange Rate Converter is open-sourced under the MIT License. For more information, refer to the LICENSE file included in the project repository.