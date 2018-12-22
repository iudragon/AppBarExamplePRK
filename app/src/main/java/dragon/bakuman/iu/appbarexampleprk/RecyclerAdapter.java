package dragon.bakuman.iu.appbarexampleprk;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

//Adapter for recyclerView

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {


    private List<String> mList;

    public RecyclerAdapter(List<String> list) {

        this.mList = list;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {


        TextView versionName;

        public MyViewHolder(TextView itemView) {
            super(itemView);

            versionName = itemView;
        }
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {


        TextView textView = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.text_view_layout, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(textView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int i) {

        viewHolder.versionName.setText(mList.get(i));

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    //for filtering we create separate method
    public void updateList(List<String> newList){

        mList = new ArrayList<>();
        mList.addAll(newList);
        notifyDataSetChanged();

    }




}