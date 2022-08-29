import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Entry {

    public static void main(String[] args) throws Exception {
        Document doc = Jsoup.connect("https://etfs.easyequities.co.za/finder").get();
        System.out.println(doc.outerHtml());
        // todo - get the links from the outer document: e.g. <a href="https://etfs.easyequities.co.za/etf?isin=ZAE000288361&amp;hsLang=en-za" class="button cta_button">Learn More</a>



        Elements elementos = doc.getElementsByClass(".auto-ellipsis.instrumentNameText");

        for (Element x: elementos) {
            System.out.println(x.text());
        }

        // easy equaties login page
        // https://identity.openeasy.io/Account/Login
        // https://www.easyequities.co.za/ -> login form -> credentials -> login

        // https://etfs.easyequities.co.za/finder
    }
}
