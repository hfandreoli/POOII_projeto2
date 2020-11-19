package unitconverter;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JComboBox;

public class FrameBuilder {

	private JFrame frame;
	private JTextField convertFromTextField;
	private JTextField convertToTextField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameBuilder window = new FrameBuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FrameBuilder() {
		initComponents();
	}

	private void initComponents() {
		// JFrame
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(700, 200);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Labels
		JLabel convertFromLabel = new JLabel("Convert from", SwingConstants.CENTER);
		convertFromLabel.setBounds(20, 15, 150, 60);
		frame.getContentPane().add(convertFromLabel);
		
		JLabel convertToLabel = new JLabel("to", SwingConstants.CENTER);
		convertToLabel.setBounds(20, 100, 150, 60);
		frame.getContentPane().add(convertToLabel);
		
		Border border = BorderFactory.createLineBorder(Color.black, 1);
		convertFromLabel.setBorder(border);
		convertToLabel.setBorder(border);
		
		// Text fields
		convertFromTextField = new JTextField();
		convertFromTextField.setBounds(180, 15, 150, 60);
		frame.getContentPane().add(convertFromTextField);
		convertFromTextField.setHorizontalAlignment(SwingConstants.CENTER);
		convertFromTextField.setColumns(10);
		
		convertToTextField = new JTextField();
		convertToTextField.setBounds(180, 100, 150, 60);
		frame.getContentPane().add(convertToTextField);
		convertToTextField.setHorizontalAlignment(SwingConstants.CENTER);
		convertToTextField.setEditable(false);
		convertToTextField.setColumns(10);
		
		// ComboBoxes
		JComboBox<Object> convertFromComboBox = new JComboBox<Object>();
		convertFromComboBox.setBounds(380, 15, 50, 25);
		frame.getContentPane().add(convertFromComboBox);
		
		JComboBox<Object> convertToComboBox = new JComboBox<Object>();
		convertToComboBox.setBounds(380, 100, 50, 25);
		frame.getContentPane().add(convertToComboBox);
	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
	}
}
