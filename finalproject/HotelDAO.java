package com.evergent.corejava.bhargav.finalproject;

import java.sql.Connection;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class HotelDAO {
	
	public int resHotel(HotelBean hb)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		try
		{
			con=HotelDBConnection.getConnection();
			String str="insert into Hoteldatabase values(?,?,?,?)";
			pstmt = con.prepareStatement(str);
			pstmt.setInt(1,hb.getId());
			pstmt.setString(2, hb.getName());
			pstmt.setInt(3, hb.getRn());
			pstmt.setString(4, hb.getCn());
			int updateCount = pstmt.executeUpdate();
			con.close();
			return updateCount;
					
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			return 0;
		}
	}
	public void reserveDetails(int id)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		try
		{
			con=HotelDBConnection.getConnection();
			String str="Select * from Hoteldatabase where reservation_id=?";
			pstmt=con.prepareStatement(str);
			pstmt.setInt(1,id);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				System.out.print("\nId : " + rs.getInt(1));
	        	System.out.print("\tName : " + rs.getString(2));
	            System.out.print("\tRoom No :" + rs.getInt(3));
	            System.out.print("\tContact No : " + rs.getString(4));
	            System.out.println();
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
	public void updateReservation(int id)
	{
		Connection con = null;
		Statement st = null;
		try
		{
			Scanner sc=new Scanner(System.in);
			con=HotelDBConnection.getConnection();
			System.out.print("Enter new guest name: ");
            String newGuestName = sc.nextLine();
            System.out.print("Enter new room number: ");
            int newRoomNumber = sc.nextInt();
            System.out.print("Enter new contact number: ");
            String newContactNumber = sc.next();
            String sql = "UPDATE Hoteldatabase SET guest_name = '" + newGuestName + "', " +
                    "room_number = " + newRoomNumber + ", " +
                    "contact_number = '" + newContactNumber + "' " +
                    "WHERE reservation_id = " + id;
            st = con.createStatement();
            int affectedRows = st.executeUpdate(sql);
            if (affectedRows > 0) {
                System.out.println("Reservation updated successfully!");
            } else {
                System.out.println("Reservation update failed.");
            }	
            con.close();
		}
		catch(Exception e)
		{
			
			System.out.println(e.toString());
		}
		
	}
	public int cancelReservation(int id)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		try
		{
			con=HotelDBConnection.getConnection();
			String str="DELETE FROM Hoteldatabase WHERE reservation_id = " +id;
			pstmt = con.prepareStatement(str);
			int updateCount = pstmt.executeUpdate();
			con.close();
			return updateCount;
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			return 0;
		}
	}

}
