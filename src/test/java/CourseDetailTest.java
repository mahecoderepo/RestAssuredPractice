import io.restassured.path.json.JsonPath;
import org.example.payload;
import org.junit.jupiter.api.Test;

public class CourseDetailTest {

    @Test
    public void courses_returned_by_api() {
        JsonPath js = new JsonPath(payload.courceDetail());
        String courseCount = js.getString("courses.size()");
        System.out.println(courseCount);

    }

    @Test
    public void print_purchase_amount_api() {
        JsonPath js = new JsonPath(payload.courceDetail());
        String pamount = js.getString("dashboard.purchaseAmount");
        System.out.println(pamount);
    }

    @Test
    public void print_title_of_first_course() {
        JsonPath js = new JsonPath(payload.courceDetail());
        String ptitle = js.getString("courses[0].title");
        System.out.println(ptitle);
    }

    @Test
    public void print_all_course_title_and_their_prices() {
        JsonPath js = new JsonPath(payload.courceDetail());
        int n = 2;
        for (int i = 0; i <= n; i++) {
            String course = js.get("courses[" + i + "].title");
            String title = js.get("courses[" + i + "].price");
            System.out.println(course + "," + title);
        }
    }

    @Test
    public void copies_sold_by_playwright() {
        JsonPath js = new JsonPath(payload.courceDetail());
        String ptitle = js.getString("courses[2].title");
        if (ptitle.equals("playwright")) {
            String pcopies = js.getString("courses[2].copies");
            System.out.println(pcopies);
        }
    }

    @Test
    public void verify_sum_of_price_is_equal_purchase_amount() {
        JsonPath js = new JsonPath(payload.courceDetail());
        int purchaseAmount = new Integer(js.get("dashboard.purchaseAmount"));
        int sum1 = sum_of_price();
        System.out.println("prices " + sum1);
        if (purchaseAmount == sum1) {
            System.out.println("prices are equal" + sum_of_price());
            System.out.println("prices are same" + purchaseAmount);
        }
    }

    public int sum_of_price() {
        int n = 2;
        int sum = 0;
        JsonPath js = new JsonPath(payload.courceDetail());
        for (int i = 0; i <= n; i++) {
            int price;
            price = new Integer(js.get("courses[" + i + "].price"));
            sum = price + sum;
        }
        return sum;
    }
}