package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sample02 {
	public void createGUI(){
		JFrame frm = new JFrame("Random");
		frm.setSize(300, 200);
		
		frm.setUndecorated(true); //메인타이틀바가 사라짐, 테두리 종료버튼 사라짐
		frm.setOpacity(0.7f); // 0~1까지 실수로 넣음 투명도 설정 ,테두리가 있으면 안먹힘
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		for(int i=0; i<10; i++){
			int x =(int)(Math.random()*300);
			int y =(int)(Math.random()*200);
			
			JButton btn = new JButton("버튼#"+i);
			btn.setBounds(x,y,70,20);
			panel.add(btn);
		}
		
		frm.add(panel);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Sample02().createGUI();
	}

}
