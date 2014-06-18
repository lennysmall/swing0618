package swing;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SampleLayout 
		extends JFrame implements ActionListener{
	Cards cards;
	JPanel panel;
	
	public SampleLayout(){
		setTitle("Card Layout");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel(new GridLayout(0, 5, 10, 0));
		addButton("<<", panel);
		addButton("<",panel);
		addButton(">",panel);
		addButton(">>",panel);
		addButton("종료",panel);
		add(panel,"North");
		cards = new Cards();
		add(cards, "Center");
		setVisible(true);
	}
	void addButton(String str, Container target){
		JButton button = new JButton(str);
		button.addActionListener(this);
	}
	private class Cards extends JPanel{
		CardLayout layout;
		public Cards(){
			layout = new CardLayout();
			setLayout(layout);
			for(int i=1; i<=10; i++){
				add(new JButton("현재 카드번호는 "+i+"입니다."));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SampleLayout();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("종료")){
			System.exit(0);
		}else if(e.getActionCommand().equals("<<")){
			cards.layout.first(cards);
		}else if(e.getActionCommand().equals("<")){
			cards.layout.previous(cards);
		}else if(e.getActionCommand().equals(">")){
			cards.layout.next(cards);
		}else if(e.getActionCommand().equals(">>")){
			cards.layout.last(cards);
		}
	}

}
