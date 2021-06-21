package com.doasialif.root.doaanakmusilm.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.doasialif.root.doaanakmusilm.R;

import java.util.HashMap;

public class MenuActivity extends AppCompatActivity implements ViewPagerEx.OnPageChangeListener, BaseSliderView.OnSliderClickListener {
	private SliderLayout mSliderSlider;
	private PagerIndicator mCustomIndicator;
	private PagerIndicator mCustomIndicator2;
	private CardView mCard1;
	private CardView mCard2;
	private static final String TAG = "MainActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		initView();

//		mAdView = (AdView) findViewById(R.id.adView);
//		AdRequest adRequest = new AdRequest.Builder().build();
//		mAdView.loadAd(adRequest);

		HashMap<String, String> url_maps = new HashMap<String, String>();
		// * Get internet
		url_maps.put("Hannibal", "http://sdk.semarangkota.go.id/komunitas/logosdk.png");
		url_maps.put("Big Bang Theory", "http://tvfiles.alphacoders.com/100/hdclearart-10.png");
		url_maps.put("House of Cards", "http://cdn3.nflximg.net/images/3093/2043093.jpg");
		url_maps.put("Game of Thrones", "http://sdk.semarangkota.go.id/komunitas/logosdk.png");
		// * Get internet

		HashMap<String, Integer> file_maps = new HashMap<String, Integer>();
		file_maps.put("Mengaji", R.drawable.mengaji);
		file_maps.put("Doa terkena musibah", R.drawable.gambar_terkena_musibah);
		file_maps.put("Doa ketika turun hujan", R.drawable.gambar__ketika_turun_hujan);
		file_maps.put("Doa kedua orang tua", R.drawable.gambar_kedua_orangtua);

		for (String name : file_maps.keySet()) {
			TextSliderView textSliderView = new TextSliderView(this);
			// initialize a SliderLayout
			textSliderView
					.description(name)
					.image(file_maps.get(name))
					.setScaleType(BaseSliderView.ScaleType.Fit)
					.setOnSliderClickListener(this);
			//add your extra information
			textSliderView.bundle(new Bundle());
			textSliderView.getBundle()
					.putString("extra", name);

			mSliderSlider.addSlider(textSliderView);
		}
		mSliderSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
		mSliderSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
		mSliderSlider.setCustomAnimation(new DescriptionAnimation());
		mSliderSlider.setDuration(4000);
		mSliderSlider.addOnPageChangeListener(this);


		mCard1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(getApplicationContext(), MateriActivity.class);
				intent.putExtra("card",1);
				startActivity(intent);
			}
		});
		mCard2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(getApplicationContext(), MateriActivity.class);
				intent.putExtra("card",2);
				startActivity(intent);
			}
		});
	}

	private void initView() {
		mSliderSlider = (SliderLayout) findViewById(R.id.sliderSlider);
		mCustomIndicator = (PagerIndicator) findViewById(R.id.custom_indicator);
		mCustomIndicator2 = (PagerIndicator) findViewById(R.id.custom_indicator2);
		mCard1 = (CardView) findViewById(R.id.card1);
		mCard2 = (CardView) findViewById(R.id.card2);
	}
	@Override
	public void onSliderClick(BaseSliderView slider) {
	}
	@Override
	public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
	}
	@Override
	public void onPageSelected(int position) {
	}
	@Override
	public void onPageScrollStateChanged(int state) {
	}
}
