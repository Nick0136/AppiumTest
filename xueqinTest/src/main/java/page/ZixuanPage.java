package page;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class ZixuanPage extends BasePage {

    private By stock = By.xpath("//*[@resource-id='com.xueqiu.android:id/listview']/android.widget.FrameLayout[1]");
    private By stockName = By.id("portfolio_stockName");
    public SearchPage gotoSearch(){
        find(By.id("action_create_cube")).click();
        return new SearchPage();
    }

    public StockinfoPage gotoStockinfo(){
        find(stock).click();
        return new StockinfoPage();
    }

    public ArrayList<String> getStocks(){
        ArrayList<String> arrayList=new ArrayList<String>();
        for (WebElement e : Driver.getCurrentDriver().findElements(stockName)){
            arrayList.add(e.getText());
            System.out.println(arrayList);
        }
        return arrayList;

    }

}
