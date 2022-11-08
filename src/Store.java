
public class Store {

	private String dress;
	private String wallet;
	private String shoes;
	
	
	public Store(String dress, String wallet, String shoes) {
		super();
		this.dress = dress;
		this.wallet = wallet;
		this.shoes = shoes;
	}
	public String getDress() {
		return dress;
	}
	public void setDress(String dress) {
		this.dress = dress;
	}
	public String getWallet() {
		return wallet;
	}
	public void setWallet(String wallet) {
		this.wallet = wallet;
	}
	public String getShoes() {
		return shoes;
	}
	public void setShoes(String shoes) {
		this.shoes = shoes;
	}
	
	@Override
	public String toString() {
		return "Store [dress=" + dress + ", wallet=" + wallet + ", shoes=" + shoes + "]";
	}
	
	
}
