package com.sak.ambarlar.util;


public class IlveIceler {
	 
	private String json = "[\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Adana\",\r\n" + 
			"    \"plaka\": 1,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Aladağ\",\r\n" + 
			"      \"Ceyhan\",\r\n" + 
			"      \"Çukurova\",\r\n" + 
			"      \"Feke\",\r\n" + 
			"      \"İmamoğlu\",\r\n" + 
			"      \"Karaisalı\",\r\n" + 
			"      \"Karataş\",\r\n" + 
			"      \"Kozan\",\r\n" + 
			"      \"Pozantı\",\r\n" + 
			"      \"Saimbeyli\",\r\n" + 
			"      \"Sarıçam\",\r\n" + 
			"      \"Seyhan\",\r\n" + 
			"      \"Tufanbeyli\",\r\n" + 
			"      \"Yumurtalık\",\r\n" + 
			"      \"Yüreğir\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Adıyaman\",\r\n" + 
			"    \"plaka\": 2,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Besni\",\r\n" + 
			"      \"Çelikhan\",\r\n" + 
			"      \"Gerger\",\r\n" + 
			"      \"Gölbaşı\",\r\n" + 
			"      \"Kahta\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Samsat\",\r\n" + 
			"      \"Sincik\",\r\n" + 
			"      \"Tut\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Afyonkarahisar\",\r\n" + 
			"    \"plaka\": 3,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Başmakçı\",\r\n" + 
			"      \"Bayat\",\r\n" + 
			"      \"Bolvadin\",\r\n" + 
			"      \"Çay\",\r\n" + 
			"      \"Çobanlar\",\r\n" + 
			"      \"Dazkırı\",\r\n" + 
			"      \"Dinar\",\r\n" + 
			"      \"Emirdağ\",\r\n" + 
			"      \"Evciler\",\r\n" + 
			"      \"Hocalar\",\r\n" + 
			"      \"İhsaniye\",\r\n" + 
			"      \"İscehisar\",\r\n" + 
			"      \"Kızılören\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Sandıklı\",\r\n" + 
			"      \"Sinanpaşa\",\r\n" + 
			"      \"Sultandağı\",\r\n" + 
			"      \"Şuhut\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Ağrı\",\r\n" + 
			"    \"plaka\": 4,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Diyadin\",\r\n" + 
			"      \"Doğubayazıt\",\r\n" + 
			"      \"Eleşkirt\",\r\n" + 
			"      \"Hamur\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Patnos\",\r\n" + 
			"      \"Taşlıçay\",\r\n" + 
			"      \"Tutak\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Amasya\",\r\n" + 
			"    \"plaka\": 5,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Göynücek\",\r\n" + 
			"      \"Gümüşhacıköy\",\r\n" + 
			"      \"Hamamözü\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Merzifon\",\r\n" + 
			"      \"Suluova\",\r\n" + 
			"      \"Taşova\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Ankara\",\r\n" + 
			"    \"plaka\": 6,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Altındağ\",\r\n" + 
			"      \"Ayaş\",\r\n" + 
			"      \"Bala\",\r\n" + 
			"      \"Beypazarı\",\r\n" + 
			"      \"Çamlıdere\",\r\n" + 
			"      \"Çankaya\",\r\n" + 
			"      \"Çubuk\",\r\n" + 
			"      \"Elmadağ\",\r\n" + 
			"      \"Güdül\",\r\n" + 
			"      \"Haymana\",\r\n" + 
			"      \"Kalecik\",\r\n" + 
			"      \"Kızılcahamam\",\r\n" + 
			"      \"Nallıhan\",\r\n" + 
			"      \"Polatlı\",\r\n" + 
			"      \"Şereflikoçhisar\",\r\n" + 
			"      \"Yenimahalle\",\r\n" + 
			"      \"Gölbaşı\",\r\n" + 
			"      \"Keçiören\",\r\n" + 
			"      \"Mamak\",\r\n" + 
			"      \"Sincan\",\r\n" + 
			"      \"Kazan\",\r\n" + 
			"      \"Akyurt\",\r\n" + 
			"      \"Etimesgut\",\r\n" + 
			"      \"Evren\",\r\n" + 
			"      \"Pursaklar\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Antalya\",\r\n" + 
			"    \"plaka\": 7,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Akseki\",\r\n" + 
			"      \"Alanya\",\r\n" + 
			"      \"Elmalı\",\r\n" + 
			"      \"Finike\",\r\n" + 
			"      \"Gazipaşa\",\r\n" + 
			"      \"Gündoğmuş\",\r\n" + 
			"      \"Kaş\",\r\n" + 
			"      \"Korkuteli\",\r\n" + 
			"      \"Kumluca\",\r\n" + 
			"      \"Manavgat\",\r\n" + 
			"      \"Serik\",\r\n" + 
			"      \"Demre\",\r\n" + 
			"      \"İbradı\",\r\n" + 
			"      \"Kemer\",\r\n" + 
			"      \"Aksu\",\r\n" + 
			"      \"Döşemealtı\",\r\n" + 
			"      \"Kepez\",\r\n" + 
			"      \"Konyaaltı\",\r\n" + 
			"      \"Muratpaşa\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Artvin\",\r\n" + 
			"    \"plaka\": 8,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Ardanuç\",\r\n" + 
			"      \"Arhavi\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Borçka\",\r\n" + 
			"      \"Hopa\",\r\n" + 
			"      \"Şavşat\",\r\n" + 
			"      \"Yusufeli\",\r\n" + 
			"      \"Murgul\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Aydın\",\r\n" + 
			"    \"plaka\": 9,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Bozdoğan\",\r\n" + 
			"      \"Efeler\",\r\n" + 
			"      \"Çine\",\r\n" + 
			"      \"Germencik\",\r\n" + 
			"      \"Karacasu\",\r\n" + 
			"      \"Koçarlı\",\r\n" + 
			"      \"Kuşadası\",\r\n" + 
			"      \"Kuyucak\",\r\n" + 
			"      \"Nazilli\",\r\n" + 
			"      \"Söke\",\r\n" + 
			"      \"Sultanhisar\",\r\n" + 
			"      \"Yenipazar\",\r\n" + 
			"      \"Buharkent\",\r\n" + 
			"      \"İncirliova\",\r\n" + 
			"      \"Karpuzlu\",\r\n" + 
			"      \"Köşk\",\r\n" + 
			"      \"Didim\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Balıkesir\",\r\n" + 
			"    \"plaka\": 10,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Altıeylül\",\r\n" + 
			"      \"Ayvalık\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Balya\",\r\n" + 
			"      \"Bandırma\",\r\n" + 
			"      \"Bigadiç\",\r\n" + 
			"      \"Burhaniye\",\r\n" + 
			"      \"Dursunbey\",\r\n" + 
			"      \"Edremit\",\r\n" + 
			"      \"Erdek\",\r\n" + 
			"      \"Gönen\",\r\n" + 
			"      \"Havran\",\r\n" + 
			"      \"İvrindi\",\r\n" + 
			"      \"Karesi\",\r\n" + 
			"      \"Kepsut\",\r\n" + 
			"      \"Manyas\",\r\n" + 
			"      \"Savaştepe\",\r\n" + 
			"      \"Sındırgı\",\r\n" + 
			"      \"Gömeç\",\r\n" + 
			"      \"Susurluk\",\r\n" + 
			"      \"Marmara\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Bilecik\",\r\n" + 
			"    \"plaka\": 11,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Bozüyük\",\r\n" + 
			"      \"Gölpazarı\",\r\n" + 
			"      \"Osmaneli\",\r\n" + 
			"      \"Pazaryeri\",\r\n" + 
			"      \"Söğüt\",\r\n" + 
			"      \"Yenipazar\",\r\n" + 
			"      \"İnhisar\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Bingöl\",\r\n" + 
			"    \"plaka\": 12,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Genç\",\r\n" + 
			"      \"Karlıova\",\r\n" + 
			"      \"Kiğı\",\r\n" + 
			"      \"Solhan\",\r\n" + 
			"      \"Adaklı\",\r\n" + 
			"      \"Yayladere\",\r\n" + 
			"      \"Yedisu\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Bitlis\",\r\n" + 
			"    \"plaka\": 13,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Adilcevaz\",\r\n" + 
			"      \"Ahlat\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Hizan\",\r\n" + 
			"      \"Mutki\",\r\n" + 
			"      \"Tatvan\",\r\n" + 
			"      \"Güroymak\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Bolu\",\r\n" + 
			"    \"plaka\": 14,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Gerede\",\r\n" + 
			"      \"Göynük\",\r\n" + 
			"      \"Kıbrıscık\",\r\n" + 
			"      \"Mengen\",\r\n" + 
			"      \"Mudurnu\",\r\n" + 
			"      \"Seben\",\r\n" + 
			"      \"Dörtdivan\",\r\n" + 
			"      \"Yeniçağa\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Burdur\",\r\n" + 
			"    \"plaka\": 15,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Ağlasun\",\r\n" + 
			"      \"Bucak\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Gölhisar\",\r\n" + 
			"      \"Tefenni\",\r\n" + 
			"      \"Yeşilova\",\r\n" + 
			"      \"Karamanlı\",\r\n" + 
			"      \"Kemer\",\r\n" + 
			"      \"Altınyayla\",\r\n" + 
			"      \"Çavdır\",\r\n" + 
			"      \"Çeltikçi\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Bursa\",\r\n" + 
			"    \"plaka\": 16,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Gemlik\",\r\n" + 
			"      \"İnegöl\",\r\n" + 
			"      \"İznik\",\r\n" + 
			"      \"Karacabey\",\r\n" + 
			"      \"Keles\",\r\n" + 
			"      \"Mudanya\",\r\n" + 
			"      \"Mustafakemalpaşa\",\r\n" + 
			"      \"Orhaneli\",\r\n" + 
			"      \"Orhangazi\",\r\n" + 
			"      \"Yenişehir\",\r\n" + 
			"      \"Büyükorhan\",\r\n" + 
			"      \"Harmancık\",\r\n" + 
			"      \"Nilüfer\",\r\n" + 
			"      \"Osmangazi\",\r\n" + 
			"      \"Yıldırım\",\r\n" + 
			"      \"Gürsu\",\r\n" + 
			"      \"Kestel\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Çanakkale\",\r\n" + 
			"    \"plaka\": 17,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Ayvacık\",\r\n" + 
			"      \"Bayramiç\",\r\n" + 
			"      \"Biga\",\r\n" + 
			"      \"Bozcaada\",\r\n" + 
			"      \"Çan\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Eceabat\",\r\n" + 
			"      \"Ezine\",\r\n" + 
			"      \"Gelibolu\",\r\n" + 
			"      \"Gökçeada\",\r\n" + 
			"      \"Lapseki\",\r\n" + 
			"      \"Yenice\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Çankırı\",\r\n" + 
			"    \"plaka\": 18,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Çerkeş\",\r\n" + 
			"      \"Eldivan\",\r\n" + 
			"      \"Ilgaz\",\r\n" + 
			"      \"Kurşunlu\",\r\n" + 
			"      \"Orta\",\r\n" + 
			"      \"Şabanözü\",\r\n" + 
			"      \"Yapraklı\",\r\n" + 
			"      \"Atkaracalar\",\r\n" + 
			"      \"Kızılırmak\",\r\n" + 
			"      \"Bayramören\",\r\n" + 
			"      \"Korgun\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Çorum\",\r\n" + 
			"    \"plaka\": 19,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Alaca\",\r\n" + 
			"      \"Bayat\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"İskilip\",\r\n" + 
			"      \"Kargı\",\r\n" + 
			"      \"Mecitözü\",\r\n" + 
			"      \"Ortaköy\",\r\n" + 
			"      \"Osmancık\",\r\n" + 
			"      \"Sungurlu\",\r\n" + 
			"      \"Boğazkale\",\r\n" + 
			"      \"Uğurludağ\",\r\n" + 
			"      \"Dodurga\",\r\n" + 
			"      \"Laçin\",\r\n" + 
			"      \"Oğuzlar\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Denizli\",\r\n" + 
			"    \"plaka\": 20,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Acıpayam\",\r\n" + 
			"      \"Buldan\",\r\n" + 
			"      \"Çal\",\r\n" + 
			"      \"Çameli\",\r\n" + 
			"      \"Çardak\",\r\n" + 
			"      \"Çivril\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Merkezefendi\",\r\n" + 
			"      \"Pamukkale\",\r\n" + 
			"      \"Güney\",\r\n" + 
			"      \"Kale\",\r\n" + 
			"      \"Sarayköy\",\r\n" + 
			"      \"Tavas\",\r\n" + 
			"      \"Babadağ\",\r\n" + 
			"      \"Bekilli\",\r\n" + 
			"      \"Honaz\",\r\n" + 
			"      \"Serinhisar\",\r\n" + 
			"      \"Baklan\",\r\n" + 
			"      \"Beyağaç\",\r\n" + 
			"      \"Bozkurt\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Diyarbakır\",\r\n" + 
			"    \"plaka\": 21,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Kocaköy\",\r\n" + 
			"      \"Çermik\",\r\n" + 
			"      \"Çınar\",\r\n" + 
			"      \"Çüngüş\",\r\n" + 
			"      \"Dicle\",\r\n" + 
			"      \"Ergani\",\r\n" + 
			"      \"Hani\",\r\n" + 
			"      \"Hazro\",\r\n" + 
			"      \"Kulp\",\r\n" + 
			"      \"Lice\",\r\n" + 
			"      \"Silvan\",\r\n" + 
			"      \"Eğil\",\r\n" + 
			"      \"Bağlar\",\r\n" + 
			"      \"Kayapınar\",\r\n" + 
			"      \"Sur\",\r\n" + 
			"      \"Yenişehir\",\r\n" + 
			"      \"Bismil\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Edirne\",\r\n" + 
			"    \"plaka\": 22,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Enez\",\r\n" + 
			"      \"Havsa\",\r\n" + 
			"      \"İpsala\",\r\n" + 
			"      \"Keşan\",\r\n" + 
			"      \"Lalapaşa\",\r\n" + 
			"      \"Meriç\",\r\n" + 
			"      \"Uzunköprü\",\r\n" + 
			"      \"Süloğlu\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Elazığ\",\r\n" + 
			"    \"plaka\": 23,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Ağın\",\r\n" + 
			"      \"Baskil\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Karakoçan\",\r\n" + 
			"      \"Keban\",\r\n" + 
			"      \"Maden\",\r\n" + 
			"      \"Palu\",\r\n" + 
			"      \"Sivrice\",\r\n" + 
			"      \"Arıcak\",\r\n" + 
			"      \"Kovancılar\",\r\n" + 
			"      \"Alacakaya\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Erzincan\",\r\n" + 
			"    \"plaka\": 24,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Çayırlı\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"İliç\",\r\n" + 
			"      \"Kemah\",\r\n" + 
			"      \"Kemaliye\",\r\n" + 
			"      \"Refahiye\",\r\n" + 
			"      \"Tercan\",\r\n" + 
			"      \"Üzümlü\",\r\n" + 
			"      \"Otlukbeli\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Erzurum\",\r\n" + 
			"    \"plaka\": 25,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Aşkale\",\r\n" + 
			"      \"Çat\",\r\n" + 
			"      \"Hınıs\",\r\n" + 
			"      \"Horasan\",\r\n" + 
			"      \"İspir\",\r\n" + 
			"      \"Karayazı\",\r\n" + 
			"      \"Narman\",\r\n" + 
			"      \"Oltu\",\r\n" + 
			"      \"Olur\",\r\n" + 
			"      \"Pasinler\",\r\n" + 
			"      \"Şenkaya\",\r\n" + 
			"      \"Tekman\",\r\n" + 
			"      \"Tortum\",\r\n" + 
			"      \"Karaçoban\",\r\n" + 
			"      \"Uzundere\",\r\n" + 
			"      \"Pazaryolu\",\r\n" + 
			"      \"Köprüköy\",\r\n" + 
			"      \"Palandöken\",\r\n" + 
			"      \"Yakutiye\",\r\n" + 
			"      \"Aziziye\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Eskişehir\",\r\n" + 
			"    \"plaka\": 26,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Çifteler\",\r\n" + 
			"      \"Mahmudiye\",\r\n" + 
			"      \"Mihalıççık\",\r\n" + 
			"      \"Sarıcakaya\",\r\n" + 
			"      \"Seyitgazi\",\r\n" + 
			"      \"Sivrihisar\",\r\n" + 
			"      \"Alpu\",\r\n" + 
			"      \"Beylikova\",\r\n" + 
			"      \"İnönü\",\r\n" + 
			"      \"Günyüzü\",\r\n" + 
			"      \"Han\",\r\n" + 
			"      \"Mihalgazi\",\r\n" + 
			"      \"Odunpazarı\",\r\n" + 
			"      \"Tepebaşı\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Gaziantep\",\r\n" + 
			"    \"plaka\": 27,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Araban\",\r\n" + 
			"      \"İslahiye\",\r\n" + 
			"      \"Nizip\",\r\n" + 
			"      \"Oğuzeli\",\r\n" + 
			"      \"Yavuzeli\",\r\n" + 
			"      \"Şahinbey\",\r\n" + 
			"      \"Şehitkamil\",\r\n" + 
			"      \"Karkamış\",\r\n" + 
			"      \"Nurdağı\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Giresun\",\r\n" + 
			"    \"plaka\": 28,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Alucra\",\r\n" + 
			"      \"Bulancak\",\r\n" + 
			"      \"Dereli\",\r\n" + 
			"      \"Espiye\",\r\n" + 
			"      \"Eynesil\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Görele\",\r\n" + 
			"      \"Keşap\",\r\n" + 
			"      \"Şebinkarahisar\",\r\n" + 
			"      \"Tirebolu\",\r\n" + 
			"      \"Piraziz\",\r\n" + 
			"      \"Yağlıdere\",\r\n" + 
			"      \"Çamoluk\",\r\n" + 
			"      \"Çanakçı\",\r\n" + 
			"      \"Doğankent\",\r\n" + 
			"      \"Güce\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Gümüşhane\",\r\n" + 
			"    \"plaka\": 29,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Kelkit\",\r\n" + 
			"      \"Şiran\",\r\n" + 
			"      \"Torul\",\r\n" + 
			"      \"Köse\",\r\n" + 
			"      \"Kürtün\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Hakkari\",\r\n" + 
			"    \"plaka\": 30,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Çukurca\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Şemdinli\",\r\n" + 
			"      \"Yüksekova\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Hatay\",\r\n" + 
			"    \"plaka\": 31,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Altınözü\",\r\n" + 
			"      \"Arsuz\",\r\n" + 
			"      \"Defne\",\r\n" + 
			"      \"Dörtyol\",\r\n" + 
			"      \"Hassa\",\r\n" + 
			"      \"Antakya\",\r\n" + 
			"      \"İskenderun\",\r\n" + 
			"      \"Kırıkhan\",\r\n" + 
			"      \"Payas\",\r\n" + 
			"      \"Reyhanlı\",\r\n" + 
			"      \"Samandağ\",\r\n" + 
			"      \"Yayladağı\",\r\n" + 
			"      \"Erzin\",\r\n" + 
			"      \"Belen\",\r\n" + 
			"      \"Kumlu\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Isparta\",\r\n" + 
			"    \"plaka\": 32,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Atabey\",\r\n" + 
			"      \"Eğirdir\",\r\n" + 
			"      \"Gelendost\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Keçiborlu\",\r\n" + 
			"      \"Senirkent\",\r\n" + 
			"      \"Sütçüler\",\r\n" + 
			"      \"Şarkikaraağaç\",\r\n" + 
			"      \"Uluborlu\",\r\n" + 
			"      \"Yalvaç\",\r\n" + 
			"      \"Aksu\",\r\n" + 
			"      \"Gönen\",\r\n" + 
			"      \"Yenişarbademli\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Mersin\",\r\n" + 
			"    \"plaka\": 33,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Anamur\",\r\n" + 
			"      \"Erdemli\",\r\n" + 
			"      \"Gülnar\",\r\n" + 
			"      \"Mut\",\r\n" + 
			"      \"Silifke\",\r\n" + 
			"      \"Tarsus\",\r\n" + 
			"      \"Aydıncık\",\r\n" + 
			"      \"Bozyazı\",\r\n" + 
			"      \"Çamlıyayla\",\r\n" + 
			"      \"Akdeniz\",\r\n" + 
			"      \"Mezitli\",\r\n" + 
			"      \"Toroslar\",\r\n" + 
			"      \"Yenişehir\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"İstanbul\",\r\n" + 
			"    \"plaka\": 34,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Adalar\",\r\n" + 
			"      \"Bakırköy\",\r\n" + 
			"      \"Beşiktaş\",\r\n" + 
			"      \"Beykoz\",\r\n" + 
			"      \"Beyoğlu\",\r\n" + 
			"      \"Çatalca\",\r\n" + 
			"      \"Eyüp\",\r\n" + 
			"      \"Fatih\",\r\n" + 
			"      \"Gaziosmanpaşa\",\r\n" + 
			"      \"Kadıköy\",\r\n" + 
			"      \"Kartal\",\r\n" + 
			"      \"Sarıyer\",\r\n" + 
			"      \"Silivri\",\r\n" + 
			"      \"Şile\",\r\n" + 
			"      \"Şişli\",\r\n" + 
			"      \"Üsküdar\",\r\n" + 
			"      \"Zeytinburnu\",\r\n" + 
			"      \"Büyükçekmece\",\r\n" + 
			"      \"Kağıthane\",\r\n" + 
			"      \"Küçükçekmece\",\r\n" + 
			"      \"Pendik\",\r\n" + 
			"      \"Ümraniye\",\r\n" + 
			"      \"Bayrampaşa\",\r\n" + 
			"      \"Avcılar\",\r\n" + 
			"      \"Bağcılar\",\r\n" + 
			"      \"Bahçelievler\",\r\n" + 
			"      \"Güngören\",\r\n" + 
			"      \"Maltepe\",\r\n" + 
			"      \"Sultanbeyli\",\r\n" + 
			"      \"Tuzla\",\r\n" + 
			"      \"Esenler\",\r\n" + 
			"      \"Arnavutköy\",\r\n" + 
			"      \"Ataşehir\",\r\n" + 
			"      \"Başakşehir\",\r\n" + 
			"      \"Beylikdüzü\",\r\n" + 
			"      \"Çekmeköy\",\r\n" + 
			"      \"Esenyurt\",\r\n" + 
			"      \"Sancaktepe\",\r\n" + 
			"      \"Sultangazi\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"İzmir\",\r\n" + 
			"    \"plaka\": 35,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Aliağa\",\r\n" + 
			"      \"Bayındır\",\r\n" + 
			"      \"Bergama\",\r\n" + 
			"      \"Bornova\",\r\n" + 
			"      \"Çeşme\",\r\n" + 
			"      \"Dikili\",\r\n" + 
			"      \"Foça\",\r\n" + 
			"      \"Karaburun\",\r\n" + 
			"      \"Karşıyaka\",\r\n" + 
			"      \"Kemalpaşa\",\r\n" + 
			"      \"Kınık\",\r\n" + 
			"      \"Kiraz\",\r\n" + 
			"      \"Menemen\",\r\n" + 
			"      \"Ödemiş\",\r\n" + 
			"      \"Seferihisar\",\r\n" + 
			"      \"Selçuk\",\r\n" + 
			"      \"Tire\",\r\n" + 
			"      \"Torbalı\",\r\n" + 
			"      \"Urla\",\r\n" + 
			"      \"Beydağ\",\r\n" + 
			"      \"Buca\",\r\n" + 
			"      \"Konak\",\r\n" + 
			"      \"Menderes\",\r\n" + 
			"      \"Balçova\",\r\n" + 
			"      \"Çiğli\",\r\n" + 
			"      \"Gaziemir\",\r\n" + 
			"      \"Narlıdere\",\r\n" + 
			"      \"Güzelbahçe\",\r\n" + 
			"      \"Bayraklı\",\r\n" + 
			"      \"Karabağlar\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Kars\",\r\n" + 
			"    \"plaka\": 36,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Arpaçay\",\r\n" + 
			"      \"Digor\",\r\n" + 
			"      \"Kağızman\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Sarıkamış\",\r\n" + 
			"      \"Selim\",\r\n" + 
			"      \"Susuz\",\r\n" + 
			"      \"Akyaka\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Kastamonu\",\r\n" + 
			"    \"plaka\": 37,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Abana\",\r\n" + 
			"      \"Araç\",\r\n" + 
			"      \"Azdavay\",\r\n" + 
			"      \"Bozkurt\",\r\n" + 
			"      \"Cide\",\r\n" + 
			"      \"Çatalzeytin\",\r\n" + 
			"      \"Daday\",\r\n" + 
			"      \"Devrekani\",\r\n" + 
			"      \"İnebolu\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Küre\",\r\n" + 
			"      \"Taşköprü\",\r\n" + 
			"      \"Tosya\",\r\n" + 
			"      \"İhsangazi\",\r\n" + 
			"      \"Pınarbaşı\",\r\n" + 
			"      \"Şenpazar\",\r\n" + 
			"      \"Ağlı\",\r\n" + 
			"      \"Doğanyurt\",\r\n" + 
			"      \"Hanönü\",\r\n" + 
			"      \"Seydiler\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Kayseri\",\r\n" + 
			"    \"plaka\": 38,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Bünyan\",\r\n" + 
			"      \"Develi\",\r\n" + 
			"      \"Felahiye\",\r\n" + 
			"      \"İncesu\",\r\n" + 
			"      \"Pınarbaşı\",\r\n" + 
			"      \"Sarıoğlan\",\r\n" + 
			"      \"Sarız\",\r\n" + 
			"      \"Tomarza\",\r\n" + 
			"      \"Yahyalı\",\r\n" + 
			"      \"Yeşilhisar\",\r\n" + 
			"      \"Akkışla\",\r\n" + 
			"      \"Talas\",\r\n" + 
			"      \"Kocasinan\",\r\n" + 
			"      \"Melikgazi\",\r\n" + 
			"      \"Hacılar\",\r\n" + 
			"      \"Özvatan\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Kırklareli\",\r\n" + 
			"    \"plaka\": 39,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Babaeski\",\r\n" + 
			"      \"Demirköy\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Kofçaz\",\r\n" + 
			"      \"Lüleburgaz\",\r\n" + 
			"      \"Pehlivanköy\",\r\n" + 
			"      \"Pınarhisar\",\r\n" + 
			"      \"Vize\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Kırşehir\",\r\n" + 
			"    \"plaka\": 40,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Çiçekdağı\",\r\n" + 
			"      \"Kaman\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Mucur\",\r\n" + 
			"      \"Akpınar\",\r\n" + 
			"      \"Akçakent\",\r\n" + 
			"      \"Boztepe\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Kocaeli\",\r\n" + 
			"    \"plaka\": 41,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Gebze\",\r\n" + 
			"      \"Gölcük\",\r\n" + 
			"      \"Kandıra\",\r\n" + 
			"      \"Karamürsel\",\r\n" + 
			"      \"Körfez\",\r\n" + 
			"      \"Derince\",\r\n" + 
			"      \"Başiskele\",\r\n" + 
			"      \"Çayırova\",\r\n" + 
			"      \"Darıca\",\r\n" + 
			"      \"Dilovası\",\r\n" + 
			"      \"İzmit\",\r\n" + 
			"      \"Kartepe\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Konya\",\r\n" + 
			"    \"plaka\": 42,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Akşehir\",\r\n" + 
			"      \"Beyşehir\",\r\n" + 
			"      \"Bozkır\",\r\n" + 
			"      \"Cihanbeyli\",\r\n" + 
			"      \"Çumra\",\r\n" + 
			"      \"Doğanhisar\",\r\n" + 
			"      \"Ereğli\",\r\n" + 
			"      \"Hadim\",\r\n" + 
			"      \"Ilgın\",\r\n" + 
			"      \"Kadınhanı\",\r\n" + 
			"      \"Karapınar\",\r\n" + 
			"      \"Kulu\",\r\n" + 
			"      \"Sarayönü\",\r\n" + 
			"      \"Seydişehir\",\r\n" + 
			"      \"Yunak\",\r\n" + 
			"      \"Akören\",\r\n" + 
			"      \"Altınekin\",\r\n" + 
			"      \"Derebucak\",\r\n" + 
			"      \"Hüyük\",\r\n" + 
			"      \"Karatay\",\r\n" + 
			"      \"Meram\",\r\n" + 
			"      \"Selçuklu\",\r\n" + 
			"      \"Taşkent\",\r\n" + 
			"      \"Ahırlı\",\r\n" + 
			"      \"Çeltik\",\r\n" + 
			"      \"Derbent\",\r\n" + 
			"      \"Emirgazi\",\r\n" + 
			"      \"Güneysınır\",\r\n" + 
			"      \"Halkapınar\",\r\n" + 
			"      \"Tuzlukçu\",\r\n" + 
			"      \"Yalıhüyük\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Kütahya\",\r\n" + 
			"    \"plaka\": 43,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Altıntaş\",\r\n" + 
			"      \"Domaniç\",\r\n" + 
			"      \"Emet\",\r\n" + 
			"      \"Gediz\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Simav\",\r\n" + 
			"      \"Tavşanlı\",\r\n" + 
			"      \"Aslanapa\",\r\n" + 
			"      \"Dumlupınar\",\r\n" + 
			"      \"Hisarcık\",\r\n" + 
			"      \"Şaphane\",\r\n" + 
			"      \"Çavdarhisar\",\r\n" + 
			"      \"Pazarlar\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Malatya\",\r\n" + 
			"    \"plaka\": 44,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Akçadağ\",\r\n" + 
			"      \"Arapgir\",\r\n" + 
			"      \"Arguvan\",\r\n" + 
			"      \"Darende\",\r\n" + 
			"      \"Doğanşehir\",\r\n" + 
			"      \"Hekimhan\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Pütürge\",\r\n" + 
			"      \"Yeşilyurt\",\r\n" + 
			"      \"Battalgazi\",\r\n" + 
			"      \"Doğanyol\",\r\n" + 
			"      \"Kale\",\r\n" + 
			"      \"Kuluncak\",\r\n" + 
			"      \"Yazıhan\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Manisa\",\r\n" + 
			"    \"plaka\": 45,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Akhisar\",\r\n" + 
			"      \"Alaşehir\",\r\n" + 
			"      \"Demirci\",\r\n" + 
			"      \"Gördes\",\r\n" + 
			"      \"Kırkağaç\",\r\n" + 
			"      \"Kula\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Salihli\",\r\n" + 
			"      \"Sarıgöl\",\r\n" + 
			"      \"Saruhanlı\",\r\n" + 
			"      \"Selendi\",\r\n" + 
			"      \"Soma\",\r\n" + 
			"      \"Şehzadeler\",\r\n" + 
			"      \"Yunusemre\",\r\n" + 
			"      \"Turgutlu\",\r\n" + 
			"      \"Ahmetli\",\r\n" + 
			"      \"Gölmarmara\",\r\n" + 
			"      \"Köprübaşı\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Kahramanmaraş\",\r\n" + 
			"    \"plaka\": 46,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Afşin\",\r\n" + 
			"      \"Andırın\",\r\n" + 
			"      \"Dulkadiroğlu\",\r\n" + 
			"      \"Onikişubat\",\r\n" + 
			"      \"Elbistan\",\r\n" + 
			"      \"Göksun\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Pazarcık\",\r\n" + 
			"      \"Türkoğlu\",\r\n" + 
			"      \"Çağlayancerit\",\r\n" + 
			"      \"Ekinözü\",\r\n" + 
			"      \"Nurhak\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Mardin\",\r\n" + 
			"    \"plaka\": 47,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Derik\",\r\n" + 
			"      \"Kızıltepe\",\r\n" + 
			"      \"Artuklu\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Mazıdağı\",\r\n" + 
			"      \"Midyat\",\r\n" + 
			"      \"Nusaybin\",\r\n" + 
			"      \"Ömerli\",\r\n" + 
			"      \"Savur\",\r\n" + 
			"      \"Dargeçit\",\r\n" + 
			"      \"Yeşilli\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Muğla\",\r\n" + 
			"    \"plaka\": 48,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Bodrum\",\r\n" + 
			"      \"Datça\",\r\n" + 
			"      \"Fethiye\",\r\n" + 
			"      \"Köyceğiz\",\r\n" + 
			"      \"Marmaris\",\r\n" + 
			"      \"Menteşe\",\r\n" + 
			"      \"Milas\",\r\n" + 
			"      \"Ula\",\r\n" + 
			"      \"Yatağan\",\r\n" + 
			"      \"Dalaman\",\r\n" + 
			"      \"Seydikemer\",\r\n" + 
			"      \"Ortaca\",\r\n" + 
			"      \"Kavaklıdere\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Muş\",\r\n" + 
			"    \"plaka\": 49,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Bulanık\",\r\n" + 
			"      \"Malazgirt\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Varto\",\r\n" + 
			"      \"Hasköy\",\r\n" + 
			"      \"Korkut\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Nevşehir\",\r\n" + 
			"    \"plaka\": 50,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Avanos\",\r\n" + 
			"      \"Derinkuyu\",\r\n" + 
			"      \"Gülşehir\",\r\n" + 
			"      \"Hacıbektaş\",\r\n" + 
			"      \"Kozaklı\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Ürgüp\",\r\n" + 
			"      \"Acıgöl\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Niğde\",\r\n" + 
			"    \"plaka\": 51,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Bor\",\r\n" + 
			"      \"Çamardı\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Ulukışla\",\r\n" + 
			"      \"Altunhisar\",\r\n" + 
			"      \"Çiftlik\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Ordu\",\r\n" + 
			"    \"plaka\": 52,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Akkuş\",\r\n" + 
			"      \"Altınordu\",\r\n" + 
			"      \"Aybastı\",\r\n" + 
			"      \"Fatsa\",\r\n" + 
			"      \"Gölköy\",\r\n" + 
			"      \"Korgan\",\r\n" + 
			"      \"Kumru\",\r\n" + 
			"      \"Mesudiye\",\r\n" + 
			"      \"Perşembe\",\r\n" + 
			"      \"Ulubey\",\r\n" + 
			"      \"Ünye\",\r\n" + 
			"      \"Gülyalı\",\r\n" + 
			"      \"Gürgentepe\",\r\n" + 
			"      \"Çamaş\",\r\n" + 
			"      \"Çatalpınar\",\r\n" + 
			"      \"Çaybaşı\",\r\n" + 
			"      \"İkizce\",\r\n" + 
			"      \"Kabadüz\",\r\n" + 
			"      \"Kabataş\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Rize\",\r\n" + 
			"    \"plaka\": 53,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Ardeşen\",\r\n" + 
			"      \"Çamlıhemşin\",\r\n" + 
			"      \"Çayeli\",\r\n" + 
			"      \"Fındıklı\",\r\n" + 
			"      \"İkizdere\",\r\n" + 
			"      \"Kalkandere\",\r\n" + 
			"      \"Pazar\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Güneysu\",\r\n" + 
			"      \"Derepazarı\",\r\n" + 
			"      \"Hemşin\",\r\n" + 
			"      \"İyidere\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Sakarya\",\r\n" + 
			"    \"plaka\": 54,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Akyazı\",\r\n" + 
			"      \"Geyve\",\r\n" + 
			"      \"Hendek\",\r\n" + 
			"      \"Karasu\",\r\n" + 
			"      \"Kaynarca\",\r\n" + 
			"      \"Sapanca\",\r\n" + 
			"      \"Kocaali\",\r\n" + 
			"      \"Pamukova\",\r\n" + 
			"      \"Taraklı\",\r\n" + 
			"      \"Ferizli\",\r\n" + 
			"      \"Karapürçek\",\r\n" + 
			"      \"Söğütlü\",\r\n" + 
			"      \"Adapazarı\",\r\n" + 
			"      \"Arifiye\",\r\n" + 
			"      \"Erenler\",\r\n" + 
			"      \"Serdivan\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Samsun\",\r\n" + 
			"    \"plaka\": 55,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Alaçam\",\r\n" + 
			"      \"Bafra\",\r\n" + 
			"      \"Çarşamba\",\r\n" + 
			"      \"Havza\",\r\n" + 
			"      \"Kavak\",\r\n" + 
			"      \"Ladik\",\r\n" + 
			"      \"Terme\",\r\n" + 
			"      \"Vezirköprü\",\r\n" + 
			"      \"Asarcık\",\r\n" + 
			"      \"Ondokuzmayıs\",\r\n" + 
			"      \"Salıpazarı\",\r\n" + 
			"      \"Tekkeköy\",\r\n" + 
			"      \"Ayvacık\",\r\n" + 
			"      \"Yakakent\",\r\n" + 
			"      \"Atakum\",\r\n" + 
			"      \"Canik\",\r\n" + 
			"      \"İlkadım\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Siirt\",\r\n" + 
			"    \"plaka\": 56,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Baykan\",\r\n" + 
			"      \"Eruh\",\r\n" + 
			"      \"Kurtalan\",\r\n" + 
			"      \"Pervari\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Şirvan\",\r\n" + 
			"      \"Tillo\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Sinop\",\r\n" + 
			"    \"plaka\": 57,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Ayancık\",\r\n" + 
			"      \"Boyabat\",\r\n" + 
			"      \"Durağan\",\r\n" + 
			"      \"Erfelek\",\r\n" + 
			"      \"Gerze\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Türkeli\",\r\n" + 
			"      \"Dikmen\",\r\n" + 
			"      \"Saraydüzü\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Sivas\",\r\n" + 
			"    \"plaka\": 58,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Divriği\",\r\n" + 
			"      \"Gemerek\",\r\n" + 
			"      \"Gürün\",\r\n" + 
			"      \"Hafik\",\r\n" + 
			"      \"İmranlı\",\r\n" + 
			"      \"Kangal\",\r\n" + 
			"      \"Koyulhisar\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Suşehri\",\r\n" + 
			"      \"Şarkışla\",\r\n" + 
			"      \"Yıldızeli\",\r\n" + 
			"      \"Zara\",\r\n" + 
			"      \"Akıncılar\",\r\n" + 
			"      \"Altınyayla\",\r\n" + 
			"      \"Doğanşar\",\r\n" + 
			"      \"Gölova\",\r\n" + 
			"      \"Ulaş\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Tekirdağ\",\r\n" + 
			"    \"plaka\": 59,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Çerkezköy\",\r\n" + 
			"      \"Çorlu\",\r\n" + 
			"      \"Ergene\",\r\n" + 
			"      \"Hayrabolu\",\r\n" + 
			"      \"Malkara\",\r\n" + 
			"      \"Muratlı\",\r\n" + 
			"      \"Saray\",\r\n" + 
			"      \"Süleymanpaşa\",\r\n" + 
			"      \"Kapaklı\",\r\n" + 
			"      \"Şarköy\",\r\n" + 
			"      \"Marmaraereğlisi\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Tokat\",\r\n" + 
			"    \"plaka\": 60,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Almus\",\r\n" + 
			"      \"Artova\",\r\n" + 
			"      \"Erbaa\",\r\n" + 
			"      \"Niksar\",\r\n" + 
			"      \"Reşadiye\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Turhal\",\r\n" + 
			"      \"Zile\",\r\n" + 
			"      \"Pazar\",\r\n" + 
			"      \"Yeşilyurt\",\r\n" + 
			"      \"Başçiftlik\",\r\n" + 
			"      \"Sulusaray\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Trabzon\",\r\n" + 
			"    \"plaka\": 61,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Akçaabat\",\r\n" + 
			"      \"Araklı\",\r\n" + 
			"      \"Arsin\",\r\n" + 
			"      \"Çaykara\",\r\n" + 
			"      \"Maçka\",\r\n" + 
			"      \"Of\",\r\n" + 
			"      \"Ortahisar\",\r\n" + 
			"      \"Sürmene\",\r\n" + 
			"      \"Tonya\",\r\n" + 
			"      \"Vakfıkebir\",\r\n" + 
			"      \"Yomra\",\r\n" + 
			"      \"Beşikdüzü\",\r\n" + 
			"      \"Şalpazarı\",\r\n" + 
			"      \"Çarşıbaşı\",\r\n" + 
			"      \"Dernekpazarı\",\r\n" + 
			"      \"Düzköy\",\r\n" + 
			"      \"Hayrat\",\r\n" + 
			"      \"Köprübaşı\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Tunceli\",\r\n" + 
			"    \"plaka\": 62,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Çemişgezek\",\r\n" + 
			"      \"Hozat\",\r\n" + 
			"      \"Mazgirt\",\r\n" + 
			"      \"Nazımiye\",\r\n" + 
			"      \"Ovacık\",\r\n" + 
			"      \"Pertek\",\r\n" + 
			"      \"Pülümür\",\r\n" + 
			"      \"Merkez\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Şanlıurfa\",\r\n" + 
			"    \"plaka\": 63,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Akçakale\",\r\n" + 
			"      \"Birecik\",\r\n" + 
			"      \"Bozova\",\r\n" + 
			"      \"Ceylanpınar\",\r\n" + 
			"      \"Eyyübiye\",\r\n" + 
			"      \"Halfeti\",\r\n" + 
			"      \"Haliliye\",\r\n" + 
			"      \"Hilvan\",\r\n" + 
			"      \"Karaköprü\",\r\n" + 
			"      \"Siverek\",\r\n" + 
			"      \"Suruç\",\r\n" + 
			"      \"Viranşehir\",\r\n" + 
			"      \"Harran\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Uşak\",\r\n" + 
			"    \"plaka\": 64,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Banaz\",\r\n" + 
			"      \"Eşme\",\r\n" + 
			"      \"Karahallı\",\r\n" + 
			"      \"Sivaslı\",\r\n" + 
			"      \"Ulubey\",\r\n" + 
			"      \"Merkez\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Van\",\r\n" + 
			"    \"plaka\": 65,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Başkale\",\r\n" + 
			"      \"Çatak\",\r\n" + 
			"      \"Erciş\",\r\n" + 
			"      \"Gevaş\",\r\n" + 
			"      \"Gürpınar\",\r\n" + 
			"      \"İpekyolu\",\r\n" + 
			"      \"Muradiye\",\r\n" + 
			"      \"Özalp\",\r\n" + 
			"      \"Tuşba\",\r\n" + 
			"      \"Bahçesaray\",\r\n" + 
			"      \"Çaldıran\",\r\n" + 
			"      \"Edremit\",\r\n" + 
			"      \"Saray\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Yozgat\",\r\n" + 
			"    \"plaka\": 66,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Akdağmadeni\",\r\n" + 
			"      \"Boğazlıyan\",\r\n" + 
			"      \"Çayıralan\",\r\n" + 
			"      \"Çekerek\",\r\n" + 
			"      \"Sarıkaya\",\r\n" + 
			"      \"Sorgun\",\r\n" + 
			"      \"Şefaatli\",\r\n" + 
			"      \"Yerköy\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Aydıncık\",\r\n" + 
			"      \"Çandır\",\r\n" + 
			"      \"Kadışehri\",\r\n" + 
			"      \"Saraykent\",\r\n" + 
			"      \"Yenifakılı\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Zonguldak\",\r\n" + 
			"    \"plaka\": 67,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Çaycuma\",\r\n" + 
			"      \"Devrek\",\r\n" + 
			"      \"Ereğli\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Alaplı\",\r\n" + 
			"      \"Gökçebey\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Aksaray\",\r\n" + 
			"    \"plaka\": 68,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Ağaçören\",\r\n" + 
			"      \"Eskil\",\r\n" + 
			"      \"Gülağaç\",\r\n" + 
			"      \"Güzelyurt\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Ortaköy\",\r\n" + 
			"      \"Sarıyahşi\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Bayburt\",\r\n" + 
			"    \"plaka\": 69,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Aydıntepe\",\r\n" + 
			"      \"Demirözü\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Karaman\",\r\n" + 
			"    \"plaka\": 70,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Ermenek\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Ayrancı\",\r\n" + 
			"      \"Kazımkarabekir\",\r\n" + 
			"      \"Başyayla\",\r\n" + 
			"      \"Sarıveliler\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Kırıkkale\",\r\n" + 
			"    \"plaka\": 71,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Delice\",\r\n" + 
			"      \"Keskin\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Sulakyurt\",\r\n" + 
			"      \"Bahşili\",\r\n" + 
			"      \"Balışeyh\",\r\n" + 
			"      \"Çelebi\",\r\n" + 
			"      \"Karakeçili\",\r\n" + 
			"      \"Yahşihan\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Batman\",\r\n" + 
			"    \"plaka\": 72,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Beşiri\",\r\n" + 
			"      \"Gercüş\",\r\n" + 
			"      \"Kozluk\",\r\n" + 
			"      \"Sason\",\r\n" + 
			"      \"Hasankeyf\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Şırnak\",\r\n" + 
			"    \"plaka\": 73,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Beytüşşebap\",\r\n" + 
			"      \"Cizre\",\r\n" + 
			"      \"İdil\",\r\n" + 
			"      \"Silopi\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Uludere\",\r\n" + 
			"      \"Güçlükonak\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Bartın\",\r\n" + 
			"    \"plaka\": 74,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Kurucaşile\",\r\n" + 
			"      \"Ulus\",\r\n" + 
			"      \"Amasra\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Ardahan\",\r\n" + 
			"    \"plaka\": 75,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Çıldır\",\r\n" + 
			"      \"Göle\",\r\n" + 
			"      \"Hanak\",\r\n" + 
			"      \"Posof\",\r\n" + 
			"      \"Damal\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Iğdır\",\r\n" + 
			"    \"plaka\": 76,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Aralık\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Tuzluca\",\r\n" + 
			"      \"Karakoyunlu\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Yalova\",\r\n" + 
			"    \"plaka\": 77,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Altınova\",\r\n" + 
			"      \"Armutlu\",\r\n" + 
			"      \"Çınarcık\",\r\n" + 
			"      \"Çiftlikköy\",\r\n" + 
			"      \"Termal\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Karabük\",\r\n" + 
			"    \"plaka\": 78,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Eflani\",\r\n" + 
			"      \"Eskipazar\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Ovacık\",\r\n" + 
			"      \"Safranbolu\",\r\n" + 
			"      \"Yenice\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Kilis\",\r\n" + 
			"    \"plaka\": 79,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Elbeyli\",\r\n" + 
			"      \"Musabeyli\",\r\n" + 
			"      \"Polateli\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Osmaniye\",\r\n" + 
			"    \"plaka\": 80,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Bahçe\",\r\n" + 
			"      \"Kadirli\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Düziçi\",\r\n" + 
			"      \"Hasanbeyli\",\r\n" + 
			"      \"Sumbas\",\r\n" + 
			"      \"Toprakkale\"\r\n" + 
			"    ]\r\n" + 
			"  },\r\n" + 
			"  {\r\n" + 
			"    \"il\": \"Düzce\",\r\n" + 
			"    \"plaka\": 81,\r\n" + 
			"    \"ilceleri\": [\r\n" + 
			"      \"Akçakoca\",\r\n" + 
			"      \"Merkez\",\r\n" + 
			"      \"Yığılca\",\r\n" + 
			"      \"Cumayeri\",\r\n" + 
			"      \"Gölyaka\",\r\n" + 
			"      \"Çilimli\",\r\n" + 
			"      \"Gümüşova\",\r\n" + 
			"      \"Kaynaşlı\"\r\n" + 
			"    ]\r\n" + 
			"  }\r\n" + 
			"]";

	public String getJson() {
		return json;
	}

}
