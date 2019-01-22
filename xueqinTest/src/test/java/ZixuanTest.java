import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.core.annotation.Order;
import page.MainPage;
import page.ZixuanPage;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.equalTo;


public class ZixuanTest {

    static MainPage mainPage;
    static ZixuanPage zixuanPage;



    @BeforeAll
    static void beforeAll(){
        mainPage= MainPage.start();
        zixuanPage=mainPage.gotoZixuan();

    }

    @Test
    @Order(1)
    void addZixuanTest(){

        ArrayList<String> stocks=zixuanPage.gotoSearch().search("pdd").addZixuan().gotoZixuan().getStocks();
        assertThat(stocks,hasItems("拼多多"));
    }


    @Test
    @Order(2)
    void cancelSelectTest(){

        String toast=zixuanPage.gotoStockinfo().deleteSelect().getToast();
        assertThat(toast, equalTo("已从自选删除"));


    }
}
