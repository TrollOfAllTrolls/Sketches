import static org.junit.Assert.*;

import org.junit.Test;

public class TicketPurchasing {

	@Test
	public void test() {
		int[] tickets = { 5, 7, 9, 3, 11 };
		TicketBot bot = new TicketBot();

		assertEquals(50, bot.buyTickets(tickets, 5));
	}

}
