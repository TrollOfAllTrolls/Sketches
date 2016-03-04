import java.util.ArrayList;
import java.util.Iterator;

public class MasterOrder {
	ArrayList<CookieOrder> Orders = new ArrayList<CookieOrder>();

	public ArrayList<CookieOrder> getCookieorders() {
		return Orders;
	}

	public void setOrders(ArrayList<CookieOrder> cookieorders) {
		Orders = cookieorders;
	}

	public ArrayList<CookieOrder> getOrders() {
		return Orders;
	}

	public void addOrder(CookieOrder cookieOrder) {
		Orders.add(cookieOrder);
	}

	public int getTotalBoxes() {
		int numberBoxes = 0;
		for (CookieOrder Cookies : Orders) {
			numberBoxes = numberBoxes + Cookies.getNumBoxes();
		}
		return numberBoxes;

	}

	public int removeVariety(String v) {
		Iterator<CookieOrder> Order = Orders.iterator();
		int removedBoxes = 0;
		while (Order.hasNext()) {
			CookieOrder Cookiez = Order.next();
			if (Cookiez.getVariety().equals(v)) {
				removedBoxes = removedBoxes + Cookiez.getNumBoxes();
				Order.remove();
			}
		}
		return removedBoxes;
	}
}
