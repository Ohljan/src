package day38_Inheritance.browserTask;

public class FireFox extends Browser{
    public FireFox() {
        super("FireFox");
    }



    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void openBrowser() {
        System.out.println("opening firefox browser");
    }

    @Override
    public void closeBroswer() {
        System.out.println("closing fire fox browser");
    }
}
/*
openBrowser(): prints "opening firefox browser"
						closeBrowser(): prints "closing fire fox browser"

 */