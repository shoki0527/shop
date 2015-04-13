package com.method;

import java.util.Iterator;
import java.util.List;

import org.jsoup.nodes.Document;

import com.cls.Shop;


public class Test {
	public static void main(String[] args){
		final String URI = "http://api.hotpepper.jp/GourmetSearch/V110/?key=guest&Latitude=35.660818&Longitude=139.775426&Range=3";

		ParserAbstract parser = new Parser();
		Document document = parser.getPage(URI);
		List<Shop> shop_list = parser.parse(document);

		Iterator<Shop> iterator = shop_list.iterator();
		while(iterator.hasNext()){
			Shop shop = iterator.next();
			System.out.println(shop.getShopName()+"##"+ shop.getShopNameKana()+"##"+shop.getLatitude()+"##"+ shop.getLongitude());
		}
	}
}
