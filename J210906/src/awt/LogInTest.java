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

public class LogInTest extends WindowAdapter {
	private Frame f;
	private Label lid, lpwd;
	private TextField id, pwd;
	private Button b;
	private String id1, pwd1;

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void startFrame() {

		f = new Frame("Log-In");
		f.setSize(400, 100);
		f.setLayout(new FlowLayout());

		lid = new Label("ID : ", Label.RIGHT);
		lpwd = new Label("Password : ", Label.RIGHT);

		id = new TextField(10);
		pwd = new TextField(10);

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.addWindowListener(this);

		b = new Button("Log-in");
		b.setSize(70, 20);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inpId = id.getText();
				String inpPwd = pwd.getText();
				if (inpId.equals(getId1()) && inpPwd.equals(getPwd1())) {
					System.out.println("Log-in.");
					System.exit(0);
				} else {
					System.out.println("Wrong ID , Password.");
				}
			}

		});

		f.add(b);
		f.setVisible(true);
	}

	public String getId1() {
		return id1;
	}

	public void setId1(String id1) {
		this.id1 = id1;
	}

	public String getPwd1() {
		return pwd1;
	}

	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}

	public static void main(String[] args) {
		LogInTest login = new LogInTest();
		login.setId1("rudals0822");
		login.setPwd1("1234");
		login.startFrame();
	}
}