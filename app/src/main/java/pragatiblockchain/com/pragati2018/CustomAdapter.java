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
import android.widget.Toast;

import java.util.List;

/**
 * Created by Bhatnagar Rishabh on 3/11/2018.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private List<Arts> objectList;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomAdapter(Context context, List<Arts> objectList){
        layoutInflater = LayoutInflater.from(context);
        this.objectList = objectList;
        this.context = context;
    }
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.layout_arts, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, final int position) {


        holder.arts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "arts clicked"+String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });
        holder.donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "donate clicked", Toast.LENGTH_SHORT).show();
            }
        });
        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "share clicked", Toast.LENGTH_SHORT).show();
            }
        });
        holder.like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "like clicked", Toast.LENGTH_SHORT).show();
            }
        });
        holder.info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "info clicked", Toast.LENGTH_SHORT).show();
            }
        });




        Arts current = objectList.get(position);
        holder.setData(current, position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private ImageView arts;
        private ImageView donate;
        private ImageView share;
        private ImageView like;
        private ImageView info;

        private int position;
        private Arts currentObject;

        public CustomViewHolder(View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.title);
            this.arts = itemView.findViewById(R.id.art);
            this.donate = itemView.findViewById(R.id.donate);
            this.share = itemView.findViewById(R.id.share);
            this.like = itemView.findViewById(R.id.like);
            this.info = itemView.findViewById(R.id.info);
        }

        public void setData(Arts currentObject, int position) {
            this.title.setText(currentObject.getTitle());
            this.arts.setImageResource(currentObject.getImage());
            this.position = position;
            this.currentObject = currentObject;
        }
    }
}