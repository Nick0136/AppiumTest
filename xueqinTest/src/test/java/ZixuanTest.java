import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.core.annotation.Order;
import page.MainPage;
import page.StockinfoPage;
import page.ZixuanPage;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.equalTo;


public class ZixuanTest {

    static MainPage mainPage;
    static ZixuanPage zixuanPage;
    static StockinfoPage stockinfoPage;


    @BeforeAll
    static void beforeAll(){
        mainPage= MainPage.start();
        zixuanPage=mainPage.gotoZixuan();

    }

    @Test
    @Order(1)
    void addZixuanTest(){
        zixuanPage.gotoSearch().search("pa").addZixuan().gotoZixuan();
    }


    @Test
    @Order(2)
    void cancelSelectTest(){


        zixuanPage.gotoStockinfo().deleteSelect();
        String setText = stockinfoPage.getSetText();
        assertThat(setText,equalTo("加自选"));

    }
}
