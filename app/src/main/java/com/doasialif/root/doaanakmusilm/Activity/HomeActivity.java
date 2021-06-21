package com.doasialif.root.doaanakmusilm.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.doasialif.root.doaanakmusilm.R;

public class HomeActivity extends AppCompatActivity {
	private Button btnMateri;
	private Button btnKeluar;
	private boolean doubleBackToExitPressedOnce;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		initView();

		btnMateri.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(getApplicationContext(), MenuActivity.class));
			}
		});

		btnKeluar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				onBackPressed();
			}
		});
	}

	private void initView() {
		btnMateri = (Button) findViewById(R.id.btn_materi);
		btnKeluar = (Button) findViewById(R.id.btn_keluar);
	}

	@Override
	public void onBackPressed() {
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
		if (doubleBackToExitPressedOnce) {
			super.onBackPressed();
			finishAffinity();
			return;
		}
		this.doubleBackToExitPressedOnce = true;
		Toast.makeText(this, "Ketuk lagi untuk keluar", Toast.LENGTH_SHORT).show();

		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				doubleBackToExitPressedOnce = false;
				finishAffinity();
			}
		}, 2000);
	}
}
