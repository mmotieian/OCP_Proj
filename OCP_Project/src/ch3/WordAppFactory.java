package ch3;

public class WordAppFactory extends AppFactory {

	App app = new WordProcessor();
	Font font = new RichFont();

	public App getApp() {
		return app;
	}

	public Font getFont() {
		return font;
	}

}
