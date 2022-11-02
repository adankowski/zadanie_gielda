# Simple feed app
Aplikacja łączy sie się do giełdy Coinbase za pomocą websocket API, 
a następnie wyświetla przychodzące dane na consoli. Dane z giełdy to tickery (klasa `TickerMessage`) 
zawierające informacje o zmianie ceny dla danego instrumentu (pole `symbol`).


## Do zrobienia
1. Należy stworzyć mechanizm, który dla przychodzących danych umożliwi przechowywanie osobno
dla każdego instrumentu ostatniej ceny `bid` i `ask` oraz `timestamp` otrzymanego wpisu z giełdy.
Format przechowywanej wiadomości: `symobl`, `askPrice`, `bidPrice`, `timestamp`.
2. Stworzyć mechanizm umożliwiający pobieranie tzw. `spread` czyli różnicy w cenach pomiędzy `ask` i `bid`.
3. Stworzyć kontroler umożliwiający pobranie ostatniego kwotowania dla danego symbolu.


# Simple feed app
The app connects to the Coinbase exchange via a websocket API, and then displays incoming data on the console. The data from the exchange are tickers (`TickerMessage` class) containing information about the price change for a given instrument (`symbol` field).

## TO DO
1. You need to create a mechanism that, for incoming data, allows you to store separately for each instrument the last `bid` and `ask` price and the timestamp of the received entry from the exchange. The format of the stored message: `symbol`, `askPrice`, `bidPrice`, `timestamp`.
2. Create a mechanism to retrieve the `spread`, i.e. the difference in prices between `ask` and `bid`.
3. Create a controller to retrieve the last quote for a given `symbol`.
