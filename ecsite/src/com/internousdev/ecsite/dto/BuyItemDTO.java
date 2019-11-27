package com.internousdev.ecsite.dto;

public class BuyItemDTO {

	//テーブルカラムに対応したフィールド変数を宣言します。
	private int id;
	private String itemName;
	private String itemPrice;

	//フィールド変数に対応したGetter,Setterを定義します。
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}

	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}

	public String getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(String itemPrice){
		this.itemPrice=itemPrice;
	}
}
