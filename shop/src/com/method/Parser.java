package com.method;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.cls.Shop;

public class Parser extends ParserAbstract{
	final String URI = "http://api.hotpepper.jp/GourmetSearch/V110/?key=guest&Latitude=35.660818&Longitude=139.775426&Range=3";

	public Parser() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public Document getPage(String uri){
		Connection connection = Jsoup.connect(uri);
		Document document = null;
		try {
			document = connection.get();

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return document;
	}
	@Override
	public List<Shop> parse(Document document) {
		// TODO 自動生成されたメソッド・スタブ
		List<Shop> shop_list = new ArrayList<Shop>();
		Elements shops = document.getElementsByTag("Shop");
		Iterator<Element> iterator = shops.iterator();
		while(iterator.hasNext()){
			Element shop = iterator.next();
			String shop_name = shop.getElementsByTag("ShopName").text();
			String shop_name_kana = shop.getElementsByTag("ShopNameKana").text();
			String latitude = shop.getElementsByTag("Latitude").text();
			String longitude = shop.getElementsByTag("Longitude").text();

			shop_list.add(new Shop(shop_name,shop_name_kana,latitude,longitude));
		}

		return shop_list;
	}
}
