package com.akb.sriutaminingsih.myapplication;
/*Nama : Sri Utami Ningsih
NIM  : 10116378
KELAS : AKB-IF9
Tanggal Pengerjaan : 02 Mei 2019*/

public class GaleryRecyclerViewItem {

    // Save car image resource id.
    private int GaleryImageId;

    public GaleryRecyclerViewItem(int GaleryImageId)
    {
        this.GaleryImageId = GaleryImageId;
    }


    public int getGaleryImageId()
    {
        return GaleryImageId;
    }

    public void setGaleryImageId(int GaleryImageId)
    {
        this.GaleryImageId = GaleryImageId;
    }
}