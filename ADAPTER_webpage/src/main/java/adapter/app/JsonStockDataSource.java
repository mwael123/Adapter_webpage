package adapter.app;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class JsonStockDataSource implements StockDataSource {

	@Override
	public ArrayList<StockData> getStockData() {
		ArrayList<StockData> itemList = new ArrayList<>();
	
		
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode rootNode = objectMapper.readTree (new File("C:\\Users\\waelm\\eclipse-workspace\\ADAPTER_webpage\\StockData.json"));
			for (JsonNode companyNode: rootNode) {
				
				String symbol= companyNode.get("symbol").asText();
				double price= companyNode.get("price_2007").asDouble();
				StockData itemStockData = new StockData (symbol, price);
				itemList.add(itemStockData);
			}
			
	
	}catch (Exception e) {
		
	} return itemList;

}
	}
