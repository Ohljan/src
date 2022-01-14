package day38_Inheritance.browserTask;

public class Safari extends Browser {
    public Safari() {
        super("Safari");
    }





    @Override
    public void openBrowser() {
        System.out.println("opening safari browser");
    }

    @Override
    public void closeBroswer() {
        System.out.println("closing safari browser");
    }
}
/*
openBrowser(): prints "opening safari browser"
						closeBrowser(): prints "closing safari browser"

 */