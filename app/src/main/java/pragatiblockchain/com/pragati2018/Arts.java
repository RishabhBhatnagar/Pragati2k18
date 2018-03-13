package pragatiblockchain.com.pragati2018;

import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Bhatnagar Rishabh on 3/11/2018.
 */

public class Arts {
    private String title;
    private int info;
    private int media;
    private int like;
    private int donate;
    private int share;

    public Arts(String title, int info, int media, int like, int donate, int share) {
        this.title = title;
        this.info = info;
        this.media = media;
        this.like = like;
        this.donate = donate;
        this.share = share;
    }

    public String getTitle() {
        return title;
    }

    public int getInfo() {
        return info;
    }

    public int getMedia() {
        return media;
    }

    public int getLike() {
        return like;
    }

    public int getDonate() {
        return donate;
    }

    public int getShare() {
        return share;
    }
}