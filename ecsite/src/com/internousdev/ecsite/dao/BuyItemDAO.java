package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {

	public BuyItemDTO getBuyItemInfo(){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		BuyItemDTO buyItemDTO=new BuyItemDTO();

		//商品情報をすべて取得するSQL文を書きます。
		String sql="SELECT id,item_name,item_price FROM item_info_transaction";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			//SQL文を実行します。
			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				//DBから取得した情報をDTOクラスに格納します。
				buyItemDTO.setId(rs.getInt("id"));
				buyItemDTO.setItemName(rs.getString("item_name"));
				buyItemDTO.setItemPrice(rs.getString("item_price"));
			}
		}
		catch(Exception e){
			//処理中に例外が発生した際に実行する処理です。
			e.printStackTrace();
		}
		//ActionクラスにDTOクラスを返します。
		return buyItemDTO;
	}
}
