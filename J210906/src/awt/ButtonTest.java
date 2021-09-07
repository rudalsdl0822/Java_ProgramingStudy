package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest extends WindowAdapter {
	private Frame frame;
	private Button button1;

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public ButtonTest() {
		frame = new Frame("Login");
		button1 = new Button("확인");
	}

	public void startFrame() {
		frame.addWindowListener(this);
		frame.setSize(300, 200);
		frame.add(button1);
		frame.setLayout(null); // 디폴트 레이아웃을 사용하지 않고 크기, 위치를 개발자가 직접 지정하겠다.
		button1.setSize(100, 50);
		button1.setLocation(100, 75);
		frame.setVisible(true);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("확인 버튼 클릭!");
			}
		});
	}

	public static void main(String[] args) {
		ButtonTest b = new ButtonTest();
		b.startFrame();
	}
}
