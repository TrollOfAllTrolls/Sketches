import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SpamALot implements ActionListener {
	static final String FAKE_USERNAME = "bobthenobisreal@gmail.com";
	static final String FAKE_PASSWORD = "bobthenobisreal123";

	public static void main(String[] args) {
		// Startup();
		SpamALot A = new SpamALot();
		A.Startup();
	}

	JButton SpamButton1 = new JButton("Good");
	JButton SpamButton2 = new JButton("Bad");
	JTextField MainText = new JTextField(15);

	public void Startup() {

		JFrame MainFrame = new JFrame("The Amazing Spam Device");
		JPanel MainPanel = new JPanel();
		;

		MainFrame.add(MainPanel);
		MainPanel.add(MainText);
		MainPanel.add(SpamButton1);
		MainPanel.add(SpamButton2);
		SpamButton1.addActionListener(this);
		SpamButton2.addActionListener(this);

		MainFrame.setVisible(true);
		MainPanel.setVisible(true);
		SpamButton1.setVisible(true);
		SpamButton2.setVisible(true);
		MainText.setVisible(true);

		MainFrame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		JButton pressedButton = (JButton) event.getSource();
		if (pressedButton == SpamButton1) {

			System.out.println("Works!");
			sendSpam(MainText.getText(), "Just an Amazing Statement",
					"You Smell Lovely Today!");
			if (sendSpam(MainText.getText(), "Just an Amazing Statement",
					"You Smell Lovely Today!") == true) {
				MainText.setBackground(Color.GREEN);

			}
			if (sendSpam(MainText.getText(), "Just an Amazing Statement",
					"You Smell Lovely Today!") == false) {
				MainText.setBackground(Color.RED);

			}
		} else if (pressedButton == SpamButton2) {

			System.out.println("Works!");
			sendSpam(MainText.getText(), "0mg L0l",
					"0mg L0L u got r3kt m8 u mad m8???");
			if (sendSpam(MainText.getText(), "0mg L0l",
					"0mg L0L u got r3kt m8 u mad m8???") == true) {
				MainText.setBackground(Color.GREEN);

			}
			if (sendSpam(MainText.getText(), "0mg L0l",
					"0mg L0L u got r3kt m8 u mad m8???") == false) {
				MainText.setBackground(Color.RED);

			}
		}
	}

	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
						return new javax.mail.PasswordAuthentication(
								FAKE_USERNAME, FAKE_PASSWORD);
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

}
