package access.ex;

public class Item {
	// 출력할 데이터값 가공 하고 ShoppingCart에서 출력
	private String name;
	private int price;
	private int quantity;

	public Item(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public int getTotalPrice() {
		return price * quantity;
	}

}
