package mainfn.java.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	   public static void main(String args[]) {
	       // 初始化 Date 对象
	       Date date = new Date();
	        
	       // 使用 toString() 函数显示日期时间
	       System.out.println(date.toString());
	       // 使用 toString() 函数显示日期时间
	       System.out.println(date.toString());
	       // 使用 toString() 函数显示日期时间
	       System.out.println(date.toString());
	       // 使用 toString() 函数显示日期时间
	       System.out.println(date.toString());
	       // 使用 toString() 函数显示日期时间
	       System.out.println(date.toString());
	       
	       Date dNow = new Date( );
	       SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
	  
	       System.out.println("当前时间为: " + ft.format(dNow));
	   }
}
