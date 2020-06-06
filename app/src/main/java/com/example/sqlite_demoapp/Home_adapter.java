package com.example.sqlite_demoapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class Home_adapter extends RecyclerView.Adapter<Home_adapter.ViewHolder> {


    ProgressDialog mProgressDialog;
    Intent intent;
    private final Context context;
    public static ArrayList<datamodel> product_list;
    public datamodel imageslists;
    ImageView thumb;
        private ArrayList<datamodel> img;

    public static String str_receiver = "servicetutorial.service.receiver";

    public Home_adapter(Context context, ArrayList<datamodel> product_list) {

        this.context = context;

        this.product_list=product_list;

        //this.imgcount = imgcount;

    }


    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewtype) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_image_gallary, null);
        intent=new Intent(str_receiver);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        img = product_list;


        //holder.tour_amount.setText(String.valueOf(img.getAmount()));
        String img_url = product_list.get(position).getName();
        String phno = product_list.get(position).getPhno();
        holder.name.setText(img_url);
        // final String File_name = (String) holder.name.getText();
        holder.tid.setText(phno);

        //holder.thumb.setImageURI(Uri.parse(img.getImage(position)));

        //Log.e("imagelist",img.getImage(position) );



    }


    @Override
    public int getItemCount() {
        return product_list.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView thumb;
        TextView name;
        TextView tid;
        TextView txt_url;

        TextView txt_category;





        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textView3);
            tid=itemView.findViewById(R.id.textView4);
           /* itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    recyclerClickEvent.itemcClickEvent(getAdapterPosition());
                }
            });*/
           /* txt_url = itemView.findViewById(R.id.txt_url);
            name = itemView.findViewById(R.id.txt_name);
            tid = itemView.findViewById(R.id.txt_id);*/
            //fbdownload = itemView.findViewById(R.id.fb_download);


        }


    }



}
