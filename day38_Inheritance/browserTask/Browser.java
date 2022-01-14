package day38_Inheritance.browserTask;

public class Browser {
    public String name;

    public Browser(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Browser{" +
                "name='" + name + '\'' +
                '}';
    }

    public void openBrowser(){
        System.out.println("opening chrome browser");
    }
    public void closeBroswer(){
        System.out.println("closing chrome browser");
    }
}
/*
Methods:
				openBrowser(): prints "opening chrome browser"
				closeBrowser():  prints "closing chrome browser"
 */