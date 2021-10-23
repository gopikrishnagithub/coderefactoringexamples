package refactoring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Item {

	private HashMap<String, String> itemInfoHM;
	private String itemName = "";
	private ArrayList<Item> children = new ArrayList<Item>();

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Item(String itemName) {
		super();
		setItemName(itemName);
		itemInfoHM = new HashMap<String, String>(20);
	}

	public void add(Item childNode) {
		children.add(childNode);
	}

	public void addItemInformation(String infoName, String info) {
		itemInfoHM.put(infoName, info);
	}

	public String getItemInformation(String infoName) {
		return itemInfoHM.get(infoName);
	}

	public String toString() {
		StringBuffer itemInfo = new StringBuffer();
		addItemInfoAndChildren(itemInfo);
		return itemInfo.toString();
	}

	private void addItemInfoAndChildren(StringBuffer itemInfo) {
		addItemInformation(itemInfo);
		addChildrenInformation(itemInfo);
	}

	private void addItemInformation(StringBuffer itemInfo) {
		itemInfo.append("\n" + itemName + " ");
		if (!itemInfoHM.isEmpty()) {
			itemInfo.append(displayProductInfo());
		}
	}

	private void addChildrenInformation(StringBuffer itemInfo) {
		Iterator<Item> it = children.iterator();
		while (it.hasNext()) {
			Item node = (Item) it.next();
			itemInfo.append(node.toString());
		}
	}

	public String displayProductInfo() {
		String productInfo = "";
		for (Map.Entry<String, String> entry : itemInfoHM.entrySet()) {
			productInfo += entry.getKey() + ": " + entry.getValue() + " ";
		}
		return productInfo;
	}

	public static void main(String[] args) {
		ItemBuilder products = new ItemBuilder("Products");
		products.addChild("Produce");
		products.addChild("Orange");
		products.addItemInformation("Price", "$1.00");
		products.addItemInformation("Stock", "100");
		products.addSibling("Apple");
		products.addSibling("Grape");
		products.editThisItem("Products");
		products.addChild("Cereal");
		products.addChild("Special K");
		products.addItemInformation("Price", "$4.00");
		products.addSibling("Raisin Bran");
		products.addItemInformation("Price", "$4.00");
		products.addSibling("Fiber One");
		products.addItemInformation("Price", "$4.00");
		products.displayAllItems();
		System.out.println("\n" + products.getItemByName("Cereal"));
	}

}
