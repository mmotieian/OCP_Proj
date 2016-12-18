package ch3;

public class TextEditFactory extends AppFactory {

	App app = new TextEditor();
	Font font = new RegularFont();

	public App getApp() {
		return app;
	}

	public Font getFont() {
		return font;
	}

}
