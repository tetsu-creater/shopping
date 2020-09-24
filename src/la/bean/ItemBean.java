package la.bean;

import java.io.Serializable;

public class ItemBean implements Serializable{
	private int code;
	private String name;
	private int price;
	private int quantity;

	public ItemBean(int code,String name,int price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public ItemBean(int code,String name,int price,int quantity) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public ItemBean() {

	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

