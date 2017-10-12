package com.example.bayu.foodrec;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by bayua on 10/11/2017.
 */



public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder>
{
    public String Data1[], Data2[];
    public int img[];
    Context ctx;


    public MyOwnAdapter(Context ct, String s1[], String s2[], int i1[]){

        ctx=ct;
        Data1=s1;
        Data2=s2;
        img=i1;
    }
    @Override
    public MyOwnHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater myInflator= LayoutInflater.from(ctx);
        View myOwnView =myInflator.inflate(R.layout.my_row,parent,false);
        return new MyOwnHolder(myOwnView);
    }

    @Override
    public void onBindViewHolder(MyOwnHolder holder, int position) {
        holder.t1.setText(Data1[position]);
        holder.t2.setText(Data2[position]);
        holder.myImage.setImageResource(img [position]);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View v)
            {
                
                String Nama_saya="INGREDIENTS";
                Intent intent = new Intent("com.example.bayu.foodrec.Main2Activity");
                intent.putExtra("Nama",Nama_saya);
                ctx.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return Data1.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder{
       TextView t1,t2;
       public RelativeLayout relativeLayout;
       ImageView myImage;
        public MyOwnHolder(View itemView) {
            super(itemView);
            t1 = (TextView) itemView.findViewById(R.id.text1);
            t2 = (TextView) itemView.findViewById(R.id.text2);
            myImage = (ImageView) itemView.findViewById(R.id.myImage);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayout);
        }
    }
}
