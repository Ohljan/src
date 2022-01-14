package day38_Inheritance.browserTask;

public class Opera extends Browser{
    public Opera() {
        super("Opera");
    }




    @Override
    public void openBrowser() {
        System.out.println("opening opera browser");
    }

    @Override
    public void closeBroswer() {
        System.out.println("closing opera browser");
    }
}
/*
openBrowser(): prints "opening opera browser"
						closeBrowser(): prints "closing opera browser"
 */