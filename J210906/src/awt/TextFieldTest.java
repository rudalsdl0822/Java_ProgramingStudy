package awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldTest extends WindowAdapter {
	private String uid = "rudals0822";
	private String upwd = "1234";

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public String getUid() {
		return uid;
	}

	public String getUpwd() {
		return upwd;
	}

	public void startFrame() {
		Frame f = new Frame("Login");
		f.setSize(400, 100);
		f.setLayout(new FlowLayout());
		f.addWindowListener(this);

		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);

		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		pwd.setEchoChar('*');

		Button b = new Button("Log-in");
		b.setSize(70, 20);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String stId = id.getText();
				String stPwd = pwd.getText();
				if (stId.equals(getUid()) && stPwd.equals(getUpwd())) {
					System.out.println("로그인 되었습니다.");
					System.exit(0);
				} else {
					System.out.println("ID 또는 PW가 올바르지 않습니다.");
				}
			}
		});

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(b);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		TextFieldTest t = new TextFieldTest();
		t.startFrame();
	}
}
