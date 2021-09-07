package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends WindowAdapter {
	private Frame f;
	private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bC, 
			bSign, bPct, bDot, bEqual, bPlus, bMinus, bDivide,
			bMultiply, bDel;
	private TextField tnum;
	private Panel p;

	public Calculator() {
		f = new Frame("Calculator");
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		b0 = new Button("0");
		bC = new Button("C");
		bDot = new Button(".");
		bSign = new Button("+/-");
		bPct = new Button("%");
		bEqual = new Button("=");
		bPlus = new Button("+");
		bMinus = new Button("-");
		bDivide = new Button("/");
		bMultiply = new Button("*");
		bDel = new Button("del");
		tnum = new TextField("0", 30);
		p = new Panel(new GridLayout(5, 4));

	}

	public void startFrame() {
		f.addWindowListener(this);
		f.add(tnum, "North");
		
		b1.addActionListener(new ActionListener());
		

		p.add(bC);
		p.add(bSign);
		p.add(bPct);
		p.add(bDivide);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(bMultiply);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(bMinus);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(bPlus);
		p.add(bDel);
		p.add(b0);
		p.add(bDot);
		p.add(bEqual);
		
		p.setSize(300,350);
		tnum.setSize(300, 50);

		f.add(p, "Center");
		f.setSize(300, 400);
		f.setVisible(true);
		f.setResizable(false);

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		// 사칙연산, C 버튼, 숫자 구현
		// 실행 시 0이 텍스트 필드에 적혀있는 채로 실행된다.
		// 종료 버튼

		Calculator c = new Calculator();
		c.startFrame();

	}

}
