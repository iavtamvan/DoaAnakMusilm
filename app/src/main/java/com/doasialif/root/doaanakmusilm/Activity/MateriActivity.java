package com.doasialif.root.doaanakmusilm.Activity;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.doasialif.root.doaanakmusilm.Adapter.DoaDalamRuangAdapter;
import com.doasialif.root.doaanakmusilm.Adapter.DoaLuarRuangAdapter;
import com.doasialif.root.doaanakmusilm.R;
public class MateriActivity extends AppCompatActivity {
	private RecyclerView mRvDaftarDoa;
	int cardIndex;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_materi);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		initView();

		cardIndex = getIntent().getIntExtra("card",0);// didpat dari activity sebelumnya (MenuActivity.java)
		mRvDaftarDoa.setHasFixedSize(true);
		mRvDaftarDoa.setLayoutManager(new GridLayoutManager(this, 2));
		if(cardIndex==1){
			DoaDalamRuangAdapter adapter = new DoaDalamRuangAdapter(this);
			mRvDaftarDoa.setAdapter(adapter);
		}else if(cardIndex==2){
			DoaLuarRuangAdapter adapter2 = new DoaLuarRuangAdapter(this);
			mRvDaftarDoa.setAdapter(adapter2);
		}
	}
	private void initView() {
		mRvDaftarDoa = (RecyclerView) findViewById(R.id.rv_daftar_doa);
	}
}