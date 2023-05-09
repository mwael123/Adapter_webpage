package adapter.app;

public class StockData {
    private String symbol;
    private double price;
    private String company;
    private String description;
    
    
	public StockData(String symbol, double price) {
		
		this.setSymbol(symbol);
		this.setPrice (price);
	}
	public String getSymbol() { 
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	//---------------------------------
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//----------------------------------------
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	//----------------------------------
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
