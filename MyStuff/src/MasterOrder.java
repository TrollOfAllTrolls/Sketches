import java.util.ArrayList;

public class MasterOrder {
	ArrayList<CookieOrder> Orders;

	public MasterOrder() {
		Orders = new ArrayList<CookieOrder>();
	}

	public void addOrder(CookieOrder cookie) {
		Orders.add(cookie);
	}

	public int getTotalBoxes() {
		int total = 0;
		for (CookieOrder cookie : Orders) {
			total += cookie.getNumBoxes();
		}
		return total;
	}

	public int removeVariety(String Variety) {
		int boxesRemoved = 0;
		for (int i = 0; i < Orders.size(); i++) {
			CookieOrder cookie = Orders.get(i);
			if (cookie.getVariety().equals(Variety)) {
				boxesRemoved += cookie.getNumBoxes();
				Orders.remove(cookie);
			}
		}
		return boxesRemoved;
	}

	public ArrayList<CookieOrder> getOrders() {
		return Orders;
	}

	public void setOrders(ArrayList<CookieOrder> cookies) {
		Orders = cookies;
	}
}
