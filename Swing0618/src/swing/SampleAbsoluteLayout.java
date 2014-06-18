package swing;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SampleAbsoluteLayout implements ActionListener{
	JButton btn3;
	public void createGUI(){
		JFrame frm = new JFrame("Absolute");
		frm.setSize(300,200);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		btn3 = new JButton("버튼3");
		
		btn1.addActionListener(this);
		btn1.setBounds(20, 5, 95 , 30);
		btn2.setBounds(55, 45, 105, 70);
		
		panel.add(btn1);
		panel.add(btn3);
		panel.add(btn2);
		
		btn3.setBounds(180, 15, 105, 90);
		
		frm.add(panel);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new SampleAbsoluteLayout().createGUI();
			}
		});
	}
	boolean visible = true;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		Point location  = btn3.getLocation();			버튼3번 이동시키는 거
//		location.move(location.x-10, location.y);
////		location.x -=10;
//		btn3.setLocation(location);
		
		if(visible){
			visible = false;
			
		}else{
			visible = true;
		
		}btn3.setVisible(visible);
	}

}
