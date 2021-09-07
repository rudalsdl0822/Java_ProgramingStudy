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
		button1 = new Button("Ȯ��");
	}

	public void startFrame() {
		frame.addWindowListener(this);
		frame.setSize(300, 200);
		frame.add(button1);
		frame.setLayout(null); // ����Ʈ ���̾ƿ��� ������� �ʰ� ũ��, ��ġ�� �����ڰ� ���� �����ϰڴ�.
		button1.setSize(100, 50);
		button1.setLocation(100, 75);
		frame.setVisible(true);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ȯ�� ��ư Ŭ��!");
			}
		});
	}

	public static void main(String[] args) {
		ButtonTest b = new ButtonTest();
		b.startFrame();
	}
}
