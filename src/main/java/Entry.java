import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Entry {

    public static void main(String[] args) throws Exception {
        Document doc = Jsoup.connect("https://www.msn.com/de-de").get();
        Elements elementos = doc.getElementsByTag("a");
        for (Element x: elementos) {
            System.out.println(x.text());
        }

        // easy equaties login page
        // https://identity.openeasy.io/Account/Login
        // https://www.easyequities.co.za/ -> login form -> credentials -> login
    }
}
