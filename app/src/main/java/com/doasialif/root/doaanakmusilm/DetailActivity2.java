package com.doasialif.root.doaanakmusilm;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.doasialif.root.doaanakmusilm.BankArray.DoaDalamRuangArray;
import com.doasialif.root.doaanakmusilm.BankArray.DoaLuarRuangArray;

public class DetailActivity2 extends AppCompatActivity {

	private TextView mTvJudulUtama;
	private ImageView mIvGambar;
	private Button mBtnPlay;
	private Button mBtnPause;
	private Button mBtnStop;
	private TextView mTvSubjudul1;
	private TextView mTvArab1;
	private TextView mTvLatin1;
	private TextView mTvArti1;
	private TextView mTvSubjudul2;
	private TextView mTvArab2;
	private TextView mTvLatin2;
	private TextView mTvArti2;

	int index,indexAdapter;
	private int audio;
	MediaPlayer mp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail2);
		getSupportActionBar().hide();
		initView();

		index = getIntent().getIntExtra("index", 0);
		indexAdapter = getIntent().getIntExtra("adapter", 0);

		if (indexAdapter==1)//Di Dalam Ruangan
		{
			DoaDalamRuangArray array = new DoaDalamRuangArray();
			mTvJudulUtama.setText(array.getJudul(index));
			mIvGambar.setImageResource(array.getGambar(index));
			audio = array.getAudio(index);
			if(index==2){
				mTvSubjudul1.setText(array.getSubjudul1(0));
				mTvArab1.setText(array.getSubArab1(0));
				mTvArti1.setText(array.getSubArti1(0));
				mTvLatin1.setText(array.getSubLatin1(0));
				mTvSubjudul2.setText(array.getSubjudul1(1));
				mTvArab2.setText(array.getSubArab1(1));
				mTvArti2.setText(array.getSubArti1(1));
				mTvLatin2.setText(array.getSubLatin1(1));
			}
		}else if(indexAdapter == 2) //Diluar Ruangan
		{

			DoaLuarRuangArray array2 = new DoaLuarRuangArray();
			mTvJudulUtama.setText(array2.getJudul(index));
			mIvGambar.setImageResource(array2.getGambar(index));
			audio = array2.getAudio(index);
			if(index==3){
				mTvSubjudul1.setText(array2.getSubJudul1(0));
				mTvArab1.setText(array2.getSubArab1(0));
				mTvArti1.setText(array2.getSubArti1(0));
				mTvLatin1.setText(array2.getSubLatin1(0));
				mTvSubjudul2.setText(array2.getSubJudul1(1));
				mTvArab2.setText(array2.getSubArab1(1));
				mTvArti2.setText(array2.getSubArti1(1));
				mTvLatin2.setText(array2.getSubLatin1(1));
			}else if(index==8){
				mTvSubjudul1.setText(array2.getSubJudul2(0));
				mTvArab1.setText(array2.getSubArab2(0));
				mTvArti1.setText(array2.getSubArti2(0));
				mTvLatin1.setText(array2.getSubLatin2(0));
				mTvSubjudul2.setText(array2.getSubJudul2(1));
				mTvArab2.setText(array2.getSubArab2(1));
				mTvArti2.setText(array2.getSubArti2(1));
				mTvLatin2.setText(array2.getSubLatin2(1));
			}

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
		mTvJudulUtama = (TextView) findViewById(R.id.tv_judul_utama);
		mIvGambar = (ImageView) findViewById(R.id.iv_gambar);
		mBtnPlay = (Button) findViewById(R.id.btn_play);
		mBtnPause = (Button) findViewById(R.id.btn_pause);
		mBtnStop = (Button) findViewById(R.id.btn_stop);
		mTvSubjudul1 = (TextView) findViewById(R.id.tv_subjudul1);
		mTvArab1 = (TextView) findViewById(R.id.tv_arab1);
		mTvLatin1 = (TextView) findViewById(R.id.tv_latin1);
		mTvArti1 = (TextView) findViewById(R.id.tv_arti1);
		mTvSubjudul2 = (TextView) findViewById(R.id.tv_subjudul2);
		mTvArab2 = (TextView) findViewById(R.id.tv_arab2);
		mTvLatin2 = (TextView) findViewById(R.id.tv_latin2);
		mTvArti2 = (TextView) findViewById(R.id.tv_arti2);
	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
		mp.stop();
		finish();
	}
}
