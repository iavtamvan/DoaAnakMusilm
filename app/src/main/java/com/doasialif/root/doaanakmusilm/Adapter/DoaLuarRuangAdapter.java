package com.doasialif.root.doaanakmusilm.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.doasialif.root.doaanakmusilm.Activity.DetailActivity;
import com.doasialif.root.doaanakmusilm.BankArray.DoaDalamRuangArray;
import com.doasialif.root.doaanakmusilm.BankArray.DoaLuarRuangArray;
import com.doasialif.root.doaanakmusilm.DetailActivity2;
import com.doasialif.root.doaanakmusilm.R;

/**
 * Created by ASUS on 28/11/2017.
 */

public class DoaLuarRuangAdapter extends RecyclerView.Adapter<DoaLuarRuangAdapter.ViewHolder> {
	DoaLuarRuangArray array = new DoaLuarRuangArray();
	Context context;

	public DoaLuarRuangAdapter(Context context) {
		this.context=context;
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
		ViewHolder holder = new ViewHolder(v);
		return holder;
	}

	@Override
	public void onBindViewHolder(ViewHolder holder, final int position) {
		holder.mimageItem.setImageResource(array.getGambar(position));
		holder.mtvItem.setText(array.getJudul(position));
		holder.mcard.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if(position==3 || position ==8){
					Intent intent = new Intent(context, DetailActivity2.class);
					intent.putExtra("index",position);
					intent.putExtra("adapter",2);
					context.startActivity(intent);
				}else{
					Intent intent = new Intent(context, DetailActivity.class);
					intent.putExtra("index",position);
					intent.putExtra("adapter",2);
					context.startActivity(intent);
				}

			}
		});
	}

	@Override
	public int getItemCount() {
		return array.jumlahDoaLuarRumah;
	}

	public class ViewHolder extends RecyclerView.ViewHolder {
		ImageView mimageItem;
		TextView mtvItem;
		CardView mcard;
		public ViewHolder(View itemView) {
			super(itemView);
			//mimageItem = (ImageView) itemView.findViewById(R.id.image_item);
			mtvItem = (TextView) itemView.findViewById(R.id.textview_item);
			mimageItem = (ImageView) itemView.findViewById(R.id.image_item);
			mcard = (CardView) itemView.findViewById(R.id.card);
		}
	}
}
