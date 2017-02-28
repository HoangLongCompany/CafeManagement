/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ta Quang Hoang
 */
public class DateDao {
    public static Date convetToDate(String dateStr) throws ParseException{
		if(dateStr==null || dateStr=="") return null;
		dateStr = dateStr.replace('/', '-');
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");		
		return dateFormat.parse(dateStr);
	}
    public static String getDate(Date date){
		if (date==null) return null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(date);
	}
    public static String getDate1(Date date){
		if (date==null) return null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		return dateFormat.format(date);
	}
    public static void kiemtrangaythang(Date d){
                
    }
    public static void main(String[] args) throws ParseException {
        String s = "20/11/1990";
        Date d = new Date();
        d = convetToDate(s);
        System.out.println(getDate1(d));
               
    }
}
