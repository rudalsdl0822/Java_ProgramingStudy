package awt;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuTest {
	// File Edit View Help

	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(300, 200);

		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("File");
		MenuItem miNew = new MenuItem("New");
		MenuItem miNewWindow = new MenuItem("New Window");
		MenuItem miOpen = new MenuItem("Open");
		MenuItem miSave = new MenuItem("Save");
		MenuItem miNewSave = new MenuItem("New name Save");

		MenuItem mPage = new MenuItem("Page setting");
		MenuItem mPrint = new MenuItem("Print");
		MenuItem miExit = new MenuItem("Exit");

		mFile.add(miNew);
		mFile.add(miNewWindow);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miNewSave);
		mFile.addSeparator();
		mFile.add(mPage);
		mFile.add(mPrint);
		mFile.addSeparator();
		mFile.add(miExit);
		
		Menu mEdit = new Menu("Edit");

		MenuItem miCancel = new MenuItem("실행 취소");
		
		mEdit.add(miCancel);
		mEdit.addSeparator();

		Menu mView = new Menu("View");
		Menu mHelp = new Menu("Help");
		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("Statusbar");
		mView.add(miStatusbar);

		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);
		mb.setHelpMenu(mHelp);

		f.setMenuBar(mb);
		f.setVisible(true);

	}

}
