package com.doasialif.root.doaanakmusilm.BankArray;

import com.doasialif.root.doaanakmusilm.R;

/**
 * Created by ASUS on 28/11/2017.
 */

public class DoaLuarRuangArray {
	private String judul[] = {
			"Doa masuk Rumah",
			"Doa Keluar Rumah",
			"Doa Sesudah Adzan",
			"Doa Sebelum dan Setelah Wudhu",
			"Doa Masuk Masjid",
			"Doa Keluar Masjid",
			"Doa naik Kendaraan",
			"Doa Bepergian",
			"Doa Ketika Turun Hujan dan Setelah Turun Hujan",
			"Doa Terkena Musibah",
	};

	private String subjudul1[][] = {
			{"Doa Sebelum Wudhu", "Doa Setelah Wudhu"},
			{"Doa Ketika Turun Hujan","Doa Setelah Turun Hujan"},
	};

	private int gambar[] = {
			R.drawable.gambar_masuk_rumah,
			R.drawable.gambar_keluar_rumah,
			R.drawable.gambar_sesudah_adzan,
			R.drawable.gambar_wudhu,
			R.drawable.gambar_masuk_masjid,
			R.drawable.gambar_keluar_masjid,
			R.drawable.gambar_naik_kendaraan,
			R.drawable.gambar_bepergian,
			R.drawable.gambar__ketika_turun_hujan,
			R.drawable.gambar_terkena_musibah,
	};

	private int audio[] = {
			R.raw.doa_masuk_rumah,
			R.raw.doa_keluar_rumah,
			R.raw.doa_sesudah_adzan,
			R.raw.doa_sebelum_dan_sesudah_wudhu,
			R.raw.doa_masuk_masjid,
			R.raw.doa_keluar_masjid,
			R.raw.doa_naik_kendaraan,
			R.raw.doa_bepergian,
			R.raw.doa_ketika_turun_hujan,
			R.raw.doa_terkena_musibah,
	};

	private String arab[] = {
			"َللّٰهُمَّ اِنِّىْ اَسْأَلُكَ خَيْرَالْمَوْلِجِ وَخَيْرَالْمَخْرَجِ بِسْمِ اللهِ وَلَجْنَا وَبِسْمِ اللهِ خَرَجْنَا وَعَلَى اللهِ تَوَكَّلْنَا",
			"بِسْمِ اللهِ تَوَكَّلْتُ عَلَى اللهِ لاَحَوْلَ وَلاَقُوَّةَ اِلاَّ بِاللهِ",
			"اَللَّهُمَّ رَبَّ هَذِهِ الدَّعْوَةِ التَّا مَّةِ وَالصَّلاَةِ الْقَائِمَةِ آتِ مُحَمَّدَانِالْوَسِيْلَةَ الْفَضِيْلَةَ وَابْعَثْهُ مَقَامًا مَحْمُوْدًانِ الَّذِيْ وَعَدْتَهُ ",
			"Doa Sebelum dan Sesudah Wudhu",
			"اَللّٰهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِكَ",
			"اَللّٰهُمَّ اِنِّى اَسْأَلُكَ مِنْ فَضْلِكَ",
			"سُبْحَانَ الَّذِىْ سَخَّرَلَنَا هَذَا وَمَاكُنَّالَهُ مُقْرِنِيْنَ وَاِنَّآ اِلَى رَبِّنَا لَمُنْقَلِبُوْنَ",
			"اللهُ أَكْبَرُ، اللهُ أَكْبَرُ، اللهُ أَكْبَرُ،  اللَّهُمَّ إِنَّا نَسْأَلُكَ فِيْ سَفَرِنَا هَذَا الْبِرَّ وَالتَّقْوَى، وَمِنَ الْعَمَلِ مَا تَرْضَى، اللَّهُمَّ هَوِّنْ عَلَيْنَا سَفَرَنَا هَذَا وَاطْوِ عَنَّا بُعْدَهُ، ا",
			"Doa Ketika Turun dan setelah turun hujan",
			"إنّاَ لِلهِ وإنَّا إِلَيْهِ رَاجِعُونَ اللَّهُمَّ أجُرْنِي فِي مُصِيبَتي وأَخْلِفْ لِي خَيْراً مِنْها",
	};

	private String subarab1[][]={
			{"بِسْمِ اللهِ","اَشْهَدُ اَنْ لاَّاِلَهَ اِلاَّاللهُ وَحْدَهُ لاَشَرِيْكَ لَهُ وَاَشْهَدُ اَنَّ مُحَمَّدًاعَبْدُهُ وَرَسُوْلُهُ. "},
			{"اللَّهُمَّ صَيِّبًا نَافِعًا","مُطِرْنَا بِفَضْلِ اللهِ وَرَحْمَتِهِ"},
	};


	private String latin[] = {
			"Allahumma innii as-aluka khoirol mauliji wa khoirol makhroji bismillaahi wa lajnaa wa bismillaahi khorojnaa wa'alallohi tawakkalnaa",
			"Bismillaahi tawakkaltu 'alallooh laa hawlaa walaa quwwata illaa bilaahi",
			"ALLOOHUMMA ROBBA HAADZIHID DA’WATIT TAAMMATI WASHSHOLAATIL QOO-IMATI AATI MUHAMMADANIL WASHIILATA WAL FADHIILATA WASY SYAROFA WAD DARAJATAL ‘AALIYATAR ROFII’ATA WAB’ATSHU MAQOOMAM MAHMUUDAL LADZII WA’ADTAH ",
			"Doa Sebelum dan sesudah wudhu",
			"Allahummaf tahlii abwaaba rohmatik",
			"Allahumma innii asaluka min fadlik",
			"Subhaanalladzii sakkhara lanaa hadza wama kunna lahu muqriniin wa-inna ilaa rabbina lamunqalibuun",
			"Allahu Akbar (3x) Allahumma inna nas aluka fii safarinaa hadzal birra wattaqwa, waminal'amalimaa tardho, allahumma hawwina 'alaynaa safaranaa hadzaa wathwi'annaa bu'dahu.",
			"Doa Turun Hujan",
			"inna lillahi wa inna ilaihi rooji’uun Allahumma ajurnii fii mushibatii wa akhlif lii khoiron minhaa",
	};

	private String sublatin[][] = {
			{"Bismillah","Asyhadu allaa ilaaha illalloohu wahdahuu laa syariika lahu wa asyhadu anna muhammadan ‘abduhuuwa rosuuluhuu"},
			{"Allahumma shayyiban nafi’aa","Mutthirnaa bifadlillahi warohmatih"},
	};

	private String arti[] = {
			"Ya Allah, aku mohon kepada-Mu sebaik-baik tempat masuk dan sebaik-baik tempat keluar dengan nama Allah kami masuk, dan dengan nama Allah kami keluar dan hanya kepada Allah, kami berserah diri",
			"Dengan nama Allah aku bertawakal kepada Allah, tiada daya dan kekuatan kecuali dengan pertolongan Allah.",
			"Ya Allah Tuhan dari seruan yang amat sempurna ini dan shalat yang ditunaikan, berikankan kepada Muhammad perantaraan dan keutamaan  dan tempatkanlah Beliau di tempat yang terpuji yang telah Engkau janjikan.",
			"Doa sebelum dan sesudah wudhu",
			"Ya Allah, bukakanlah pintu rahmat-Mu untukku",
			"Ya Allah, sesungguhnya aku memohon kepadaMu akan segala keutamaanMu",
			"Maha suci Tuhan yang telah menundukkan semua ini bagi kami, padahal sebelumnya kami tidak mampu menguasainya, dan sesungguhnya kami akan kembali kepada Tuhan kami",
			"Allah Maha Besar (3x),Ya Allah, Sesungguhnya kami memohon pada perjalanan ini kebaikan dan taqwa , dan amalan yang Engkau ridhoi. Ya Allah, mudahkanlah perjalanan kami ini, dan pendekkankanlah jaraknya",
			"Doa Ketika Turun Hujan",
			"Sesungguhnya kami milik Allah dan kepadaNya kami akan kembali, Ya Allah berilah pahala kepadaku dalam musibahku, dan gantikan untukku yang lebih baik darinya",
	};

	private String subarti[][] = {
			{"Dengan menyebut Nama Allah","Aku bersaksi, bahwa tiada sesembahan yang berhak disembah kecuali Allah, dan aku bersaksi bahwa Muhammad itu adalah hambaNya dan utusanNya"},
			{"Ya Allah, turunkanlah hujan yang bermanfaat","Kami diberi hujan dengan karunia dan rahmat dari Allah"},
	};

	public int jumlahDoaLuarRumah = judul.length;

	public String getJudul(int x) {
		String mjudul = judul[x];
		return mjudul;
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

	public String getLatin(int x) {
		String mlatin = latin[x];
		return mlatin;
	}

	public String getArti(int x) {
		String marti = arti[x];
		return marti;
	}

	public String getSubJudul1(int x) {
		String msubjudul = subjudul1[0][x];
		return msubjudul;
	}

	public String getSubArab1(int x) {
		String msubarab = subarab1[0][x];
		return msubarab;
	}

	public String getSubLatin1(int x) {
		String msublatin = sublatin[0][x];
		return msublatin;
	}

	public String getSubArti1(int x) {
		String msubarti = subarti[0][x];
		return msubarti;
	}

	public String getSubJudul2(int x) {
		String msubjudul = subjudul1[1][x];
		return msubjudul;
	}

	public String getSubArab2(int x) {
		String msubarab = subarab1[1][x];
		return msubarab;
	}

	public String getSubLatin2(int x) {
		String msublatin = sublatin[1][x];
		return msublatin;
	}

	public String getSubArti2(int x) {
		String msubarti = subarti[1][x];
		return msubarti;
	}
}