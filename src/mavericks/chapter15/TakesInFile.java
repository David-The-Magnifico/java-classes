import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class TakesInFile {

    public static double calculateTotalAmount(String jsonFilePath) {
        double totalAmount = 0;

        try {
            JSONParser parser = new JSONParser();
            JSONArray transactions = (JSONArray) parser.parse(new FileReader(jsonFilePath));

            for (Object transactionObj : transactions) {
                JSONObject transaction = (JSONObject) transactionObj;
                double amount = (double) transaction.get("amount");
                totalAmount += amount;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return totalAmount;
    }

    public static void main(String[] args) {
        String jsonFilePath = "C:\Users\oladi\Desktop\Transactions.json";
        double totalAmount = calculateTotalAmount(jsonFilePath);
        System.out.println("The total amount in the transactions is: " + totalAmount);
    }
}