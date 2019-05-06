package com.akb.sriutaminingsih.myapplication;
/*Nama : Sri Utami Ningsih
NIM  : 10116378
KELAS : AKB-IF9
Tanggal Pengerjaan : 02 Mei 2019*/

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;

public class Gallery_Fragment extends Fragment {
    private List<GaleryRecyclerViewItem> GalleryItemList = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        initializeDailyItemList();

        // Create the recyclerview.
        RecyclerView GalleryRecyclerView = (RecyclerView)view.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),2);
        // Set layout manager.
        GalleryRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        GaleryRecyclerViewDataAdapter GaleryDataAdapter = new GaleryRecyclerViewDataAdapter(GalleryItemList);
        // Set data adapter.
        GalleryRecyclerView.setAdapter(GaleryDataAdapter);
        return view;
    }
    private void initializeDailyItemList()
    {
        if(GalleryItemList == null)
        {
            GalleryItemList = new ArrayList<GaleryRecyclerViewItem>();
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.o1));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.o2));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.o3));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.o4));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.foto));

        }
    }

}