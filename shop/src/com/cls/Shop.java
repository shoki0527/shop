package com.cls;

public class Shop {
	private String ShopName;
	private String ShopNameKana;
	private String Latitude = null;
	private String Longitude = null;

	//ショップ名、ショップ名(カナ)
	public Shop(String ShopName,String ShopNameKana) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.ShopName = ShopName;this.ShopNameKana = ShopNameKana;
	}
	//ショップ名、ショップ名(カナ)、緯度、経度
	public Shop(String ShopName,String ShopNameKana,String Latitude,String Longitude) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.ShopName = ShopName;this.ShopNameKana = ShopNameKana;this.Latitude = Latitude;this.Longitude = Longitude;
	}

	public String getShopName() {
		return ShopName;
	}
	public String getShopNameKana() {
		return ShopNameKana;
	}
	public String getLatitude() {
		return Latitude;
	}
	public String getLongitude() {
		return Longitude;
	}

}
