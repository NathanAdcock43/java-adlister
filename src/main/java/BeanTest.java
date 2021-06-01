import com.sun.org.apache.xpath.internal.Arg;

import java.util.ArrayList;
import java.util.Date;

//Create a class, BeanTest, and include a main method that instantiates a few instances
//of Album, Author and Quote.

//In BeanTest, experiment with storing multiple instances of Quote in an arraylist and iterating over
// it to print out the content and author name of multiple quotes.

public class BeanTest {
    public static void main (String[] args){
    Album nevermind = new Album();
    Quote clothes = new Quote();
    Author markTwain= new Author();
}

    List<Quote> quoteList = new ArrayList<>();

        for (Quote quote : quoteList) {
        if (quote.equals("")) {
            quoteList.add("");
            continue;
        }
        quoteList.add(quote);
    }




}

