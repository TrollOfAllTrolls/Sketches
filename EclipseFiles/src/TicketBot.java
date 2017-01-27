
public class TicketBot {
	public TicketBot() {

	}

	public int buyTickets(int[] tickets, int amount) {
		int moneySpent = 0;

		for (int i = 0; i < amount; i++) {
			int mostExpensive = tickets[0];
			int mIPlace = 0;
			for (int j = 0; j < tickets.length; j++) {
				if (tickets[j] > mostExpensive) {
					mostExpensive = tickets[j];
					mIPlace = j;
				}
			}
			moneySpent += mostExpensive;
			tickets[mIPlace] = tickets[mIPlace] = 1;
		}

		return moneySpent;
	}
}
