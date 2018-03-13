package pragatiblockchain.com.pragati2018;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Bhatnagar Rishabh on 3/11/2018.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private List<Arts> objectList;
    private LayoutInflater layoutInflater;
    public CustomAdapter(Context context, List<Arts> objectList){
        layoutInflater = LayoutInflater.from(context);
        this.objectList = objectList;
    }
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.layout_arts, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Arts current = objectList.get(position);
        holder.setData(current, position);
    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private ImageView arts;
        private int position;
        private Arts currentObject;
        public CustomViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            arts = itemView.findViewById(R.id.art);
        }

        public void setData(Arts currentObject, int position) {
            this.title.setText(currentObject.getTitle());
            this.arts.setImageResource(currentObject.getImage());
            this.position = position;
            this.currentObject = currentObject;
        }
    }
}