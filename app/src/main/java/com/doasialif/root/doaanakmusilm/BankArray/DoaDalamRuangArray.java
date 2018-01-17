package com.doasialif.root.doaanakmusilm.BankArray;

import com.doasialif.root.doaanakmusilm.R;

/**
 * Created by ASUS on 28/11/2017.
 */

public class DoaDalamRuangArray {
	private String judul[] = {
			"Doa mau Tidur",
			"Doa Bangun Tidur",
			"Doa Masuk Kamar mandi dan Doa Keluar Kamar Mandi",
			"Doa Mau Makan",
			"Doa Setelah Makan",
			"Doa Mau Belajar",
	//		"Doa Setelah Belajar",
			"Doa Memakai Pakaian",
			"Doa Melepas Pakaian",
	//		"Doa Sebelum Mandi",
	//		"Doa Sesudah Mandi",
	//		"Doa Mau Cebok",
			"Doa Bercermin",
			"Doa Bersin",
			"Doa Ketika Lupa Membaca Doa Makan",
			"Doa Mimpi Buruk",
			"Doa untuk Kedua Orang Tua",
	};

	private String subjudul1[][] = {
			{"Doa Masuk Kamar Mandi", "Doa Keluar Kamar Mandi"},
	};

	private String subjudul2[][] = {
			{"Doa Ketika Bersin", "Doa Ketika mendengar orang lain bersin", "Doa menjawab orang yang mendoakan kita"},
	};

	private int gambar[] = {
			R.drawable.gambar_sebelum_tidur,
			R.drawable.gambar_bangun_tidur,
			R.drawable.gambar_masuk_kamar_mandi,
			R.drawable.gambar_sebelum_makan,
			R.drawable.gambar_sesudah_makan,
			R.drawable.gambar_sebelum_belajar,
			//0,
			R.drawable.gambar_memakai_pakaian,
			R.drawable.gambar_melepas_pakaian,
//			0,
//			0,
//			0,
			R.drawable.gambar_ketika_bercermin,
			R.drawable.gambar_ketika_bersin,
			R.drawable.gambar_lupa_membaca_doa_makan,
			R.drawable.gambar_mimpi_buruk,
			R.drawable.gambar_kedua_orangtua,
	};

	private int audio[] = {
			R.raw.doa_sebelum_tidur,
			R.raw.doa_bangun_tidur,
			R.raw.doa_masuk_dan_keluar_kamar_mandi,
			R.raw.doa_sebelum_makan,
			R.raw.doa_sesudah_makan,
			R.raw.doa_sebelum_belajar,
	//		0,
			R.raw.doa_memakai_pakaian,
			R.raw.doa_melepas_pakaian,
	//		0,
	//		0,
	//		0,
			R.raw.doa_bercermin,
			R.raw.doa_ketika_bersin,
			R.raw.doa_lupa_membaca_doa_makan,
			R.raw.doa_mimpi_buruk,
			R.raw.doa_kedua_orangtua,
	};

	private String arab[] = {
			"ُبِسْمِكَ اللّهُمَّ اَحْيَا و بِسْمِكَََ اَمُوْت",
			"َلْحَمْدُ للهِ الَّذِى اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ ",
			"",
			"اَللَّهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ",
			"اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ",
			"رَبِّ زِدْنِىْ عِلْمًا وَارْزُقْنِىْ فَهْمًا",
	//		"NULL",
			"اَلْحَمْدُ ِللهِ الَّذِىْ كَسَانِىْ هَذَا وَرَزَقَنِيْهِ مِنْ غَيْرِ حَوْلٍ مِنِّىْ وَلاَقُوَّةٍ",
			"بِسْمِ اللهِ الَّذِيْ لاَ إِلَهَ إِلَّا هُوَ",
	//		"NULL",
	//		"NULL",
	//		"NULL",
			"اَلْحَمْدُ ِللهِ اللّهُمَّ كَمَا حَسَّنْتَ خَلْقِىْ  فَحَسِّـنْ خُلُقِىْ",
			"Doa Ketika Bersin",
			"بِسْمِ اللهِ فِىِ أَوِّلِهِ وَ آخِرِهِ",
			"أَعُوذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجِيمِ ",
			"رَبِّ اغْفِرْلِيْ وَلِوَالِدَيَّ وَارْحَمْهُمَاكَمَارَبَّيَانِيْ صَغِيْرَا",
	};

	private String subarab[][] = {
			{"ِبِسْمِ الله اَللّهُمَّ اِنىِّ اَعُوْذُ بِكَ مِنَ الْخُبُثِ وَ الْخَبَائِثِ", "غُفْرَانَكَ"},
	};

	private String subarab2[][] = {
			{"اَلْحَمْدُ ِللهِ", "يَرْحَمُكَ اللهُ", "يَهْدِيْكُمُ اللهُ وَيَصْلِحُ بَالَكُم"}
	};

	private String latin[] = {
			"BISMIKA ALLAHUMMA AHYAA WA BISMIKA AMUUT(U)",
			"Alhamdulillahil Ladzi Ahyana Ba’da Ma Amatana Wailaihin Nusyur",
			"",
			"Alloohumma barik lanaa fiimaa razaqtanaa waqinaa 'adzaa bannar",
			"Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alanaa muslimiin",
			"Robbi zidnii 'ilman warzuqnii fahmaa",
	//		"NULL",
			"Alhamdu lillaahil ladzii kasaanii haadzaa  wa rozaqoniihi min ghoiri hawlim minni wa laa quwwatin",
			"Bismillaahil ladzii laa ilaaha illaa huwa",
	//		"NULL",
	//		"NULL",
	//		"NULL",
			"Alhamdulillaahi Allahumma kamaa hassanta kholqii fahassin khuluqii",
			"Doa Ketika Bersin",
			"Bismillah fi awwalihi wa aakhirihi",
			"Auudzubillahiminasysyaithoonirrojiim",
			"Robbighfirlii waliwaalidayya warham humma kamaa rabbayaa nii shaghiiraa",
	};

	private String sublatin[][] = {
			{"Bismillahi Alloohumma Innii a'uudzubika minal khubutsi wal khoaaitsi", "Ghufraanaka"}
	};

	private String sublatin2[][] = {
			{"Alhamdulillaah", "Yarhamukalloh", "Yahdiikumulloh wa yaslihu balakum"}
	};

	private String arti[] = {
			"Dengan nama-Mu ya Allah aku hidup dan dengan nama-Mu aku mati.",
			"Segala puji bagi Allah yang telah menghidupkan aku setelah mematikan aku dan kepadaNya aku akan kembali.",
			"",
			"Ya Allah, berkahilah apa yang telah Engkau rizkikan kepada kami dan peliharalah kami dari siksa api neraka",
			"Segala puji bagi Allah yang telah memberi kami makan dan minum, dan telah menjadikan kami dari golongan muslim orang-orang yang berserah diri",
			"Ya Allah, tambahkanlah  ilmu pengetahuanku dan berilah aku kefahaman",
	//		"NULL",
			"Segala puji  milik Allah yang telah memakaikan pakaian ini kepadaku dan memberikan rizeki barupa pakaian ini kepadaku tanpa  daya dan kekuatan dariku",
			"Dengan nama Allah yang tiada Tuhan selain-Nya",
	//		"NULL",
	//		"NULL",
	//		"NULL",
			"Segala puji bagi Allah, Ya Allah sebagaimana Engkau telah memperindah  rupaku, maka baguskanlah budi pekertiku",
			"Doa Ketika Bersin",
			"Dengan nama Allah pada awal dan akhirnya",
			"Aku berlindung kepada Allah dari godaan syaitan yang terkutuk",
			"Wahai Robku, ampunilah aku dan kedua orang tuaku, dan sayangilah mereka berdua sebagaimana mereka berdua mendidikku ketika kecil",
	};

	private String subarti[][] = {
			{"Dengan menyebut Nama Allah Ya Allah, sesungguhnya aku berlindung kepada-Mu dari syetan  laki-laki dan syetan perempuan", "Aku memohon ampunanMu"}
	};

	private String subarti2[][] = {
			{"Segala Puji Bagi Allah", "Semoga Allah merahmati engkau", "Semoga Allah menunjuki dan memperbaiki keadaanmu"}
	};

	public int jumlahDoaDalamRumah = judul.length;

	public String getJudul(int x) {
		String mjudul = judul[x];
		return mjudul;
	}

	public String getSubjudul1(int x) {
		String subjudul = subjudul1[0][x];
		return subjudul;
	}

	public String getSubjudul2(int x) {
		String subjudul = subjudul2[0][x];
		return subjudul;
	}

	public int getGambar(int x) {
		int mgambar = gambar[x];
		return mgambar;
	}

	public int getAudio(int x) {
		int maudio = audio[x];
		return maudio;
	}

	public String getArab(int x) {
		String marab = arab[x];
		return marab;
	}

	public String getSubArab1(int x) {
		String msubarab = subarab[0][x];
		return msubarab;
	}

	public String getSubArab2(int x) {
		String msubarab = subarab2[0][x];
		return msubarab;
	}

	public String getLatin(int x) {
		String mlatin = latin[x];
		return mlatin;
	}

	public String getSubLatin1(int x) {
		String msublatin = sublatin[0][x];
		return msublatin;
	}

	public String getSubLatin2(int x) {
		String msublatin = sublatin2[0][x];
		return msublatin;
	}

	public String getArti(int x) {
		String marti = arti[x];
		return marti;
	}

	public String getSubArti1(int x) {
		String msubarti = subarti[0][x];
		return msubarti;
	}

	public String getSubArti2(int x) {
		String msubarti = subarti2[0][x];
		return msubarti;
	}
}
