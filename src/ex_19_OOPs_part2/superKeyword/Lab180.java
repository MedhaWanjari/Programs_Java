package ex_19_OOPs_part2.superKeyword;

public class Lab180 {
    public static void main(String[] args) {

    }
}

class BaseClass{
    private String browser;

    public BaseClass(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if(isAdmin){
            this.browser = browser;
        }
        else{
            System.out.println("change browser not allowed, not a admin");
        }

    }

    void openBrowser(){
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName){
        System.out.println("Open Browser!! -> + browserName");
    }

    void closeBrowser(){
        System.out.println("Close Browser!!");
    }
}

class TestCase1 extends BaseClass{
    public TestCase1(String browser){
        super(browser); // Call to my Parent Constructor
    }

    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        System.out.println("Override the parent set browser");
    }
}


