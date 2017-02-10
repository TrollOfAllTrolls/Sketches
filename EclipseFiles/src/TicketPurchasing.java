import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicketPurchasing {

	@Test
	public void test() {
		int[] tickets = { 5, 6, 3, 1, 9 };
		TicketBot bot = new TicketBot();

		assertEquals(36, bot.buyTickets(tickets, 5));

		int[] tickets2 = { 5, 6, 3, 1, 9 };

		assertEquals(36, bot.buyTicketsAlt(tickets2, 5));
	}

}
