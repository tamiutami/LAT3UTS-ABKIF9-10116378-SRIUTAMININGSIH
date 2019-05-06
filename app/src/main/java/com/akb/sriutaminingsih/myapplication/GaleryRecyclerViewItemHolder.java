package com.akb.sriutaminingsih.myapplication;
/*Nama : Sri Utami Ningsih
NIM  : 10116378
KELAS : AKB-IF9
Tanggal Pengerjaan : 02 Mei 2019*/

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



public class GaleryRecyclerViewItemHolder extends RecyclerView.ViewHolder {

    private ImageView GaleryImageView = null;

    public GaleryRecyclerViewItemHolder(View itemView) {
        super(itemView);

        if(itemView != null)
        {
            GaleryImageView = (ImageView)itemView.findViewById(R.id.card_view_image);
        }
    }



    public ImageView getGaleryImageView() {
        return GaleryImageView;
    }
}