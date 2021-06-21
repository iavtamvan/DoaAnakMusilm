package com.doasialif.root.doaanakmusilm.Activity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.doasialif.root.doaanakmusilm.BankArray.DoaDalamRuangArray;
import com.doasialif.root.doaanakmusilm.BankArray.DoaLuarRuangArray;
import com.doasialif.root.doaanakmusilm.R;

public class DetailActivity extends AppCompatActivity {
    int index, indexAdapter;
    private TextView mTvJudul;
    private ImageView mIvGambar;
    private Button mBtnPlay;
    private Button mBtnStop;
    private Button mBtnPause;
    private TextView mTvArab;
    private TextView mTvLatin;
    private TextView mTvArti;
    private int audio;
    private LottieAnimationView laPlay, laPause;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
//		getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().hide();
        initView();
        index = getIntent().getIntExtra("index", 0);
        indexAdapter = getIntent().getIntExtra("adapter", 0);


        if (indexAdapter == 1)//Di Dalam Ruangan
        {
            DoaDalamRuangArray array = new DoaDalamRuangArray();
            mTvJudul.setText(array.getJudul(index));
            mIvGambar.setImageResource(array.getGambar(index));
            mTvArab.setText(array.getArab(index));
            mTvArti.setText(array.getArti(index));
            mTvLatin.setText(array.getLatin(index));
            audio = array.getAudio(index);
        } else if (indexAdapter == 2) //Diluar Ruangan
        {
            DoaLuarRuangArray array2 = new DoaLuarRuangArray();
            mTvJudul.setText(array2.getJudul(index));
            mIvGambar.setImageResource(array2.getGambar(index));
            mTvArab.setText(array2.getArab(index));
            mTvArti.setText(array2.getArti(index));
            mTvLatin.setText(array2.getLatin(index));
            audio = array2.getAudio(index);
        }

        mp = MediaPlayer.create(this, audio);

        mBtnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        mBtnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });

        mBtnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();
            }
        });
    }

    private void initView() {
        mTvJudul = (TextView) findViewById(R.id.tv_judul);
        mIvGambar = (ImageView) findViewById(R.id.iv_gambar);
        mBtnPlay = (Button) findViewById(R.id.btn_play);
        mBtnStop = (Button) findViewById(R.id.btn_stop);
        mBtnPause = (Button) findViewById(R.id.btn_pause);
        mTvArab = (TextView) findViewById(R.id.tv_arab);
        mTvLatin = (TextView) findViewById(R.id.tv_latin);
        mTvArti = (TextView) findViewById(R.id.tv_arti);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mp.stop();
        finish();
    }
}
