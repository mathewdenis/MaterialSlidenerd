package materialslidenerd.com.materialslidenerd.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

import materialslidenerd.com.materialslidenerd.R;
import materialslidenerd.com.materialslidenerd.model.Model;

/**
 * Created by Dell on 10/14/2015.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    List<Model> data = Collections.emptyList();

    public MyAdapter(Context context , List<Model> data){
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.single_row , viewGroup , false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int i) {
        Model currentData = data.get(i);
        viewHolder.title.setText(currentData.title);
        viewHolder.icon.setImageResource(currentData.iconId);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView title;
        ImageView icon;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.single_row_title);
            icon = (ImageView) itemView.findViewById(R.id.single_row_img);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext() , "Click at "+ getPosition() , Toast.LENGTH_LONG).show();
        }
    }
}
