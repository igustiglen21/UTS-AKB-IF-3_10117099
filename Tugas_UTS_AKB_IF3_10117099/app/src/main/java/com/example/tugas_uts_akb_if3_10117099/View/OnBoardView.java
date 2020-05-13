package com.example.tugas_uts_akb_if3_10117099.View;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.example.tugas_uts_akb_if3_10117099.R;
import com.example.tugas_uts_akb_if3_10117099.MainActivity;
import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

/** NIM : 10117099
 * Nama : I Gusti Glen Joyo Diningrat Wiyono
 * Kelas : IF 3
 * Tanggal : 13-05-2020**/
public class OnBoardView extends TutorialActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addFragment(new Step.Builder().setTitle("Tambah Data Teman")
                .setContent("Menambahkan Profil Teman")
                .setBackgroundColor(Color.parseColor("#FF0000")) // int background color
                .setDrawable(R.drawable.h1) // int top drawable
                .setSummary("Dapat mencatat data profil teman")
                .build());
        addFragment(new Step.Builder().setTitle("Mengubah Data Teman")
                .setContent("Mengubah Data Profil Teman")
                .setBackgroundColor(Color.parseColor("#ffd500")) // int background color
                .setDrawable(R.drawable.h2) // int top drawable
                .setSummary("Dapat mengubah data profil teman")
                .build());
        addFragment(new Step.Builder().setTitle("Tampil Data Teman")
                .setContent("Menampilkan Daftar Teman")
                .setBackgroundColor(Color.parseColor("#3bb44a")) // int background color
                .setDrawable(R.drawable.h3) // int top drawable
                .setSummary("Dapat menampilkan daftar teman yang sudah di tambahkan")
                .build());
        setCancelText("Skip");

    }

    @Override
    public void finishTutorial() {
        super.finishTutorial();
        Intent intent = new Intent(OnBoardView.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
