
public class TicketBot {
	public TicketBot() {

	}

	public int buyTickets(int[] tickets, int amount) {
		int moneySpent = 0;
		int count = 0;
		for (int i = 0; i < amount; i++) {
			int mostExpensive = tickets[0];
			int mIPlace = 0;

			for (int j = 0; j < tickets.length; j++) {
				count++;
				if (tickets[j] > mostExpensive) {

					mostExpensive = tickets[j];
					mIPlace = j;
				}
			}
			System.out.println(count);
			moneySpent += mostExpensive;
			tickets[mIPlace] = tickets[mIPlace] - 1;
		}

		return moneySpent;
	}

	public int buyTicketsAlt(int[] tickets, int amount) {
		int moneySpent = 0;
		int count = 0;
		int[] largestNum = { 0, 1 };
		int[] larNumPlace = { 0, 1 };

		for (int i = 0; i < amount; i++) {
			if (largestNum[1] > largestNum[0]) {
				for (int j = 0; j < tickets.length; j++) {
					if (tickets[j] > largestNum[0]) {
						largestNum[1] = largestNum[0];
						larNumPlace[1] = larNumPlace[0];
						largestNum[0] = tickets[j];
						larNumPlace[0] = j;
					} else if (tickets[j] > largestNum[1]) {
						largestNum[1] = tickets[j];
						larNumPlace[1] = j;
					}
					count++;
				}
			}
			moneySpent += largestNum[0];
			largestNum[0]--;
			tickets[larNumPlace[0]]--;
			count++;
			System.out.println(count);
		}
		return moneySpent;
	}
}
