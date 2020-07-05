package thefunny;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowGUI implements ActionListener {
	
	int count = 0;
	JLabel label;
	JFrame frame;
	JPanel panel;

	public WindowGUI() {
		
		JFrame frame = new JFrame();
		
		JLabel olabel = new JLabel("jessestaff sent you a message");
		
		JButton button = new JButton("Go Ahead, Click");
		button.addActionListener(this);
		
		JLabel label = new JLabel("dont you wanna see it?");
		
	    panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(olabel);
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("funny");
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		
	}
	
	public static void main(String[] args) {
		new WindowGUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		  String url = "https://www.google.com/search?q=troll+face&sxsrf=ALeKk00cPjIHoNjbGBUY_2Ny2qiTipYqQQ:1593844573962&source=lnms&tbm=isch&sa=X&ved=2ahUKEwifz6Hd_bLqAhX9hXIEHcI4Cm8Q_AUoAXoECDsQAw&biw=1920&bih=979#imgrc=zxeSvzEAp9vKcM";

	        if(Desktop.isDesktopSupported()){
	            Desktop desktop = Desktop.getDesktop();
	            try {
	                desktop.browse(new URI(url));
	            } catch (IOException | URISyntaxException e1) {
	                e1.printStackTrace();
	            }
	        }else{
	            Runtime runtime = Runtime.getRuntime();
	            try {
	                runtime.exec("xdg-open " + url);
	            } catch (IOException e1) {
	                e1.printStackTrace();
	            }
	        }
	    }
		
		
		
	}


