package awt;

import java.awt.Frame;
import java.awt.Label;

public class LabelTest {

	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);

		Label id = new Label("ID : ");
		id.setBounds(50, 50, 30, 30);
		// 50, 50 ��ġ�� 30, 10�� ũ���

		Label pwd = new Label("Password : ");
		pwd.setBounds(50, 65, 100, 10);

		f.add(id);
		f.add(pwd);
		f.setVisible(true);

	}

}
