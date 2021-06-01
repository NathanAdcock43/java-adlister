import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads{
    private ArrayList<AdModel> adsDoa ;
    private Object Ads;


    private ArrayList<AdModel> CreateList (){
         ArrayList<AdModel> ListOfAds = new ArrayList<>();
         ListOfAds.add(new AdModel(1L, "Tom", "Boat", "Big boat"));
         ListOfAds.add(new AdModel(2L, "Sam", "Dog", "Small Dog"));
         ListOfAds.add(new AdModel(3L, "Wilma", "Car", "Used Car"));

         return ListOfAds;
     }

    @Override
    public List<AdModel> All() {
         if (Ads == null){
             adsDoa = CreateList();
         }
        return adsDoa;
    }
}
