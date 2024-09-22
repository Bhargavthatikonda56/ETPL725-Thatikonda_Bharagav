package com.evergent.corejava.bhargav.finalproject;


public class HotelService {
	
	HotelDAO hd=new HotelDAO();
	public int reserveHotel(int id,String name,int rn,String cn)
	{
		HotelBean hb=new HotelBean();
		hb.setId(id);
		hb.setName(name);
		hb.setRn(rn);
		hb.setCn(cn);
		int re=hd.resHotel(hb);
		return re;
	}
	
	public void viewResDetails(int id)
	{
		hd.reserveDetails(id);	
	}
	public void updateDetails(int id)
	{
		hd.updateReservation(id);
	}
	public int cancelRes(int id)
	{
		int re=hd.cancelReservation(id);
		return re;
	}

}
