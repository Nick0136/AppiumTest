package page;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import sun.security.util.PropertyExpander;


public class StockinfoPage extends BasePage {
//    private By float_action = By.xpath("//*[@resource-id='com.xueqiu.android:id/floating_action_view']");
    private By set= By.xpath("//*[@text='设自选']");
    private By addSet= By.xpath("//*[@text='加自选']");
    private By delete=text("删除自选");
    private By modify=text("修改分组");




    public StockinfoPage deleteSelect() {
//        find(float_action).findElement(set).click();

//        for (i = 0; i < 3; i++) {
            WebElement el = Driver.getWait().until(ExpectedConditions.presenceOfElementLocated(set));
            if (el.getText() == "设自选") {
                el.click();
           }else{
                System.out.println(el.getText());
                Driver.getWait().until(ExpectedConditions.presenceOfElementLocated(set)).click();
            }

            find(delete).click();
            return new StockinfoPage();
        }




    public String getSetText(){
        return Driver.getWait().until(ExpectedConditions.presenceOfElementLocated(addSet)).getText();
    }

    public String getToast(){
        WebElement element=Driver.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.Toast']")));
        return element.getText();
    }

}
