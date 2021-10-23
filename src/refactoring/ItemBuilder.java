package refactoring;

import java.util.ArrayList;

public class ItemBuilder {

	ArrayList<Item> items = new ArrayList<Item>();
	private Item root;
	private Item current;
	private Item parent;

	public ItemBuilder(String rootName) {
		root = new Item(rootName);
		addItemToArrayList(root);
		current = root;
		parent = root;
		root.addItemInformation("Parent", parent.getItemName());
	}

	public void addItemInformation(String name, String value) {
		current.addItemInformation(name, value);
	}

	public void addChild(String child) {
		Item childNode = new Item(child);
		addItemToArrayList(childNode);
		current.add(childNode);
		parent = current;
		current = childNode;
		childNode.addItemInformation("Parent", parent.getItemName());
	}

	public void addSibling(String sibling) {
		Item siblingNode = new Item(sibling);
		addItemToArrayList(siblingNode);
		parent.add(siblingNode);
		current = siblingNode;
		siblingNode.addItemInformation("Parent", parent.getItemName());
	}

	public void addItemToArrayList(Item newItem) {
		items.add(newItem);
	}

	public String toString() {
		return root.toString();
	}

	public void displayAllItems() {
		for (Item item : items) {
			System.out.println(item.getItemName() + ": " + item.displayProductInfo());
		}
	}

	public void editThisItem(String itemName) {
		for (Item item : items) {
			if (item.getItemName().equals(itemName)) {
				current = item;
				setItemsParent(current.getItemInformation("Parent"));
			}
		}
	}

	public void setItemsParent(String parentItem) {
		for (Item item : items) {
			if (item.getItemName().equals(parentItem)) {
				parent = item;
			}
		}
	}

	public Item getItemByName(String itemToGet) {
		Item itemToReturn = null;
		for (Item item : items) {
			if (item.getItemName().equals(itemToGet)) {
				itemToReturn = item;
			}
		}
		return itemToReturn;
	}
}
