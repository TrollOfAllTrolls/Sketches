import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WindowList implements ActionListener {
	JFrame MainFrame = new JFrame("List Menu");
	JPanel MainPanel = new JPanel();
	JButton AddButton = new JButton("Add");
	JButton ViewButton = new JButton("View");
	JButton ClearButton = new JButton("Clear");
	HashMap<String, String> AddList = new HashMap<String, String>();

	public static void main(String[] args) {
		WindowList RunMethod = new WindowList();
		RunMethod.Run();
	}

	public void Run() {
		MainFrame.add(MainPanel);
		MainPanel.add(AddButton);
		MainPanel.add(ViewButton);
		MainPanel.add(ClearButton);
		AddButton.addActionListener(this);
		ViewButton.addActionListener(this);
		ClearButton.addActionListener(this);
		MainFrame.setVisible(true);
		MainFrame.setSize(250, 60);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == AddButton) {
			AddList.put(JOptionPane.showInputDialog("Type in a Password"), JOptionPane.showInputDialog("Now type in your Balance"));
		}
		if (e.getSource() == ViewButton) {
			String addList = "";
			for (String i : AddList.keySet()) {
				addList += i + ", $" + AddList.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, addList);
		}
		if (e.getSource() == ClearButton) {
			AddList.clear();
		}

	}
}
