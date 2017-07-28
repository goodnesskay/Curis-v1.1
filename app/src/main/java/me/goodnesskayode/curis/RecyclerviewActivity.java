package me.goodnesskayode.curis;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import me.goodnesskayode.curis.models.Request;

class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyHolder>{

    List<Request> requestdata;

    public RecyclerviewAdapter(List<Request> requestdata) {
        this.requestdata = requestdata;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.myview,parent,false);

        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    public void onBindViewHolder(MyHolder holder, int position) {
        Request data = requestdata.get(position);
        holder.creatorName.setText(data.getRequestCreatorName());
        holder.creatorAddress.setText(data.getRequestCreatorAddress());
        holder.creatorDestination.setText(data.getRequestCreatorDestination());
        holder.patientsNumber.setText(data.getNumberOfPatients());
    }

    @Override
    public int getItemCount() {
        return requestdata.size();
    }


    class MyHolder extends RecyclerView.ViewHolder{
        TextView creatorName,creatorAddress,creatorDestination,patientsNumber;

        public MyHolder(View itemView) {
            super(itemView);
            creatorName = (TextView) itemView.findViewById(R.id.name);
            creatorAddress= (TextView) itemView.findViewById(R.id.address);
            creatorDestination = (TextView) itemView.findViewById(R.id.destination);
            patientsNumber = (TextView) itemView.findViewById(R.id.patients);
        }
    }


}
