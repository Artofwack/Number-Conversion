import java.awt.event.*;
import javax.swing.*;

/**
 * GUI for Number conversion for binary, decimal and hexadecimal numbers
 * 
 * @author Arturo Polanco
 *
 */
public class Menu extends JFrame implements ActionListener {

	JPanel panel;
	JButton decBIN;
	JButton decHEX;
	JButton binDEC;
	JButton binHEX;
	JButton hexBIN;
	JButton hexDEC;

	/**
	 * creates and shows the GUI 
	 */
	public Menu() {
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create GUI artifacts
		panel = new JPanel();
		decBIN = new JButton();
		decHEX = new JButton();
		binDEC = new JButton();
		binHEX = new JButton();
		hexBIN = new JButton();
		hexDEC = new JButton();

		// Label buttons
		binDEC.setText("Bin to Dec");
		binHEX.setText("Bin to Hex");
		decBIN.setText("Dec to Bin");
		decHEX.setText("Dec to Hex");
		hexBIN.setText("Hex to Bin");
		hexDEC.setText("Hex to Dec");

		// Attach actions to buttons
		binDEC.addActionListener(this);
		binHEX.addActionListener(this);
		decBIN.addActionListener(this);
		decHEX.addActionListener(this);
		hexBIN.addActionListener(this);
		hexDEC.addActionListener(this);

		// Add buttons to GUI
		panel.add(binDEC);
		panel.add(binHEX);
		panel.add(decBIN);
		panel.add(decHEX);
		panel.add(hexBIN);
		panel.add(hexDEC);

		add(panel);
		pack();
	}

	/**
	 * Actions for the buttons
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String input = JOptionPane.showInputDialog(null);

		// Binary Conversion
		if (e.getSource() == binDEC) {
			JOptionPane.showMessageDialog(null, Binary.convertToDecimal(input), "Binary to Decimal Conversion",
					JOptionPane.INFORMATION_MESSAGE);
		}

		if (e.getSource() == binHEX) {
			JOptionPane.showMessageDialog(null, Binary.convertToHexadecimal(input), "Binary to Hexadecimal Conversion",
					JOptionPane.INFORMATION_MESSAGE);
		}

		// Decimal Conversion
		if (e.getSource() == decBIN) {
			JOptionPane.showMessageDialog(null, Decimal.convertToBinary(input), "Decimal to Binary Conversion",
					JOptionPane.INFORMATION_MESSAGE);
		}

		if (e.getSource() == decHEX) {
			JOptionPane.showMessageDialog(null, Decimal.convertToHexadecimal(input),
					"Decimal to Hexadecimal Conversion", JOptionPane.INFORMATION_MESSAGE);
		}

		// Hexadecimal Conversion
		if (e.getSource() == hexBIN) {
			JOptionPane.showMessageDialog(null, Hexadecimal.convertToBinary(input), "Hexadecimal to Binary Conversion",
					JOptionPane.INFORMATION_MESSAGE);
		}

		if (e.getSource() == hexDEC) {
			JOptionPane.showMessageDialog(null, Hexadecimal.convertToDecimal(input),
					"Hexadecimal to Decimal Conversion", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
