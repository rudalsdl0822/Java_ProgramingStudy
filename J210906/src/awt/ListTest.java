package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListTest {
	private static List selectMany;

	public static void main(String[] args) {

		Frame f = new Frame("List - Select");
		f.setSize(400, 200);
		f.setLayout(null);

		Button b = new Button("select");
		b.setSize(70, 40);
		b.setLocation(300, 50);
		

		List selectOne = new List(6);
		selectOne.setLocation(20, 40);
		selectOne.setSize(100, 120);
		selectOne.add("Student");
		selectOne.add("Teacher");
		selectOne.add("Driver");
		selectOne.add("Computer Programmer");
		selectOne.add("Sales Man");
		selectOne.add("Musician");
		selectOne.add("Director");

		List selectMany = new List(6, true);
		selectMany.setLocation(150, 40);
		selectMany.setSize(100, 120);
		selectMany.add("Student");
		selectMany.add("Teacher");
		selectMany.add("Computer Programmer");
		selectMany.add("Sales Man");
		selectMany.add("Musician");
		selectMany.add("Director");

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.out.println("ют╥б!");
					String[] ar = selectMany.getSelectedItems();
					for (int i = 0; i < ar.length; i++) {
						System.out.println(ar[i]);
					}
				}
			}
		);
		f.add(selectOne);
		f.add(selectMany);
		f.add(b);
		f.setVisible(true);

	}

}
