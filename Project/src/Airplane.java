public abstract class Airplane {
	private String date;
	private String time;
	private int businessPrice;
	private int economyPrice;
	private String path;
	public Airplane(int businessPrice, int economyPrice, String date, String time, String path) {
		this.businessPrice = businessPrice;
		this.economyPrice = economyPrice;
		this.date = date;
		this.time = time;
		this.path = path;
	}
	public String getPath() {
		return path;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getBusinessPrice() {
		return businessPrice;
	}

	public void setBusinessPrice(int businessPrice) {
		this.businessPrice = businessPrice;
	}

	public int getEconomyPrice() {
		return economyPrice;
	}

	public void setEconomyPrice(int economyPrice) {
		this.economyPrice = economyPrice;
	}

	public abstract void business();
	public abstract void economy();
	@Override
	public String toString() {
		return "Airplane [date=" + date + ", time=" + time + ", businessPrice=" + businessPrice + ", economyPrice="
				+ economyPrice + "]";
	}
	
	
}