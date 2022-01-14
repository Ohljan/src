package day38_Inheritance.browserTask;

public class ChromBrowser extends Browser {
    public ChromBrowser() {
        super("ChromBrowser");
    }

    @Override
    public void openBrowser() {
        System.out.println("opening chrome browser");
    }

    @Override
    public void closeBroswer() {
        System.out.println("opening chrome browser");
    }
}





/*
	methods:
						openBrowser(): prints "opening chrome browser"
						closeBrowser():  prints "opening chrome browser"
 */