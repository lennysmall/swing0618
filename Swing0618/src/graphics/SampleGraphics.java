package graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SampleGraphics {
	public void createGUI(){
		JFrame frm = new JFrame("Graphics");
		frm.setSize(300, 200);
		
		JPanel panel = new MyPanel();
		frm.add(panel);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}

	public static void main(String[] args) {
		new SampleGraphics().createGUI();


	}

}


class MyPanel extends JPanel{
	@Override
	protected void paintComponent(Graphics g) { //그래픽스 g를 이용하여 그림을 그림
		super.paintComponent(g);
		Color color = Color.YELLOW;
		Color color2 = new Color(255,205,100); //rgb값 
		g.setColor(color2);
		g.fillRect(0, 0, 300, 200);
		
		g.setColor(Color.RED);
		
		g.drawString("하이브리드앱", 15, 15);
		g.drawLine(10, 20, 110, 20); // 가로선 
		g.drawRect(10, 30, 100, 30); //rectangle 사각형 만들기
		g.draw3DRect(10, 70, 100, 30, true);
		g.drawRoundRect(10, 110, 100, 50, 30, 30);
	}
}