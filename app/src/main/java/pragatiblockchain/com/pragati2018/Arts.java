package pragatiblockchain.com.pragati2018;

import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bhatnagar Rishabh on 3/11/2018.
 */

public class Arts {



    private String title;
    private int image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public static List<Arts> getObjectList(){
        List<Arts> dataModel = new ArrayList<>();
        int[] images = getImages();
        for(int i = 0; i<images.length; i++){
            Arts art = new Arts();
            art.setImage(images[i]);
            art.setTitle("art no"+String.valueOf(i));
            dataModel.add(art);
        }
        return dataModel;
    }

    public static int[] getImages(){
        int[] images = {R.drawable.heart, R.drawable.heart, R.drawable.heart, R.drawable.heart};
        return images;
    }
}