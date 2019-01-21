package page;

import org.openqa.selenium.By;

public class ZixuanPage extends BasePage {



    By stock = By.xpath("//*[@resource-id='com.xueqiu.android:id/listview']/android.widget.FrameLayout[1]");
    public SearchPage gotoSearch(){
        find(By.id("action_create_cube")).click();
        return new SearchPage();
    }

    public StockinfoPage gotoStockinfo(){
        find(stock).click();
        return new StockinfoPage();
    }




}
