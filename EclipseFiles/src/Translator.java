import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Translator implements ActionListener {
	HashMap<String, String> Translations;
	JFrame MainFrame;
	JPanel MainPanel;
	JTextField OriginalWord;
	JTextField TranslatedWord;
	JLabel OWordLabel;
	JLabel TWordLabel;
	JButton AddButton;
	JButton SearchButton;
	String SearchInput;

	public static void main(String[] args) {
		new Translator();
	}

	public Translator() {
		Translations = new HashMap<String, String>();
		MainFrame = new JFrame("Translator");
		MainPanel = new JPanel();
		OriginalWord = new JTextField(15);
		TranslatedWord = new JTextField(15);
		OWordLabel = new JLabel("Original");
		TWordLabel = new JLabel("Translated");
		AddButton = new JButton("Add translation");
		SearchButton = new JButton("Search for translation");

		MainFrame.add(MainPanel);
		MainPanel.add(OriginalWord);
		MainPanel.add(OWordLabel);
		MainPanel.add(TranslatedWord);
		MainPanel.add(TWordLabel);
		MainPanel.add(AddButton);
		MainPanel.add(SearchButton);
		AddButton.addActionListener(this);
		SearchButton.addActionListener(this);
		MainFrame.setVisible(true);
		MainFrame.pack();

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == AddButton) {
			Translations.put(OriginalWord.getText(), TranslatedWord.getText());
		}
		if (e.getSource() == SearchButton) {
			SearchInput = JOptionPane.showInputDialog("Desired word to be translated");
			if (Translations.containsKey(SearchInput)) {
				JOptionPane.showMessageDialog(null,
						"The translation for " + SearchInput + " is " + Translations.get(SearchInput) + ".");
			} else {
				JOptionPane.showMessageDialog(null,
						"This word is not in the translation dictionary. Please try again.");
			}
		}
	}
}
