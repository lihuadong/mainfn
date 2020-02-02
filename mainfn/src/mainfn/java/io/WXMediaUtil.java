/**
 * 包打听全知道-微信H5版本
 * weixin.util
 * WXMediaDownload.java
 * Ver0.0.1
 * 2015年8月13日-下午12:03:36
 *  2015全智道(北京)科技有限公司-版权所有
 * 
 */
package mainfn.java.io;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 
 * WXMediaDownload
 * 
 * 李华栋
 * 李华栋
 * 2015年8月13日 下午12:03:36
 * 
 * @version 0.0.1
 * 
 */
public class WXMediaUtil {

	public static boolean httpDownload(String httpUrl,String saveFile){  
	       // 下载网络文件  
	       int bytesum = 0;  
	       int byteread = 0;  
	  
	       URL url = null;  
	       
			    try {  
			        		url = new URL(httpUrl);  
			        		URLConnection conn = url.openConnection();  
			        		InputStream inStream = conn.getInputStream();  
			        		FileOutputStream fs = new FileOutputStream(saveFile);  
			  
			           byte[] buffer = new byte[1204];  
			           
			           while ((byteread = inStream.read(buffer)) != -1) {  
			               bytesum += byteread;  
			               //System.out.println(bytesum);  
			               fs.write(buffer, 0, byteread);  
			           } 
			           return true;
			           
			    } catch (MalformedURLException e1) {  
			        // TODO Auto-generated catch block  
			        e1.printStackTrace();  
			        return false;  
			    } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				}
	   } 

	public static boolean httpDownload(String httpUrl,File saveFile){  
	       // 下载网络文件  
	       int bytesum = 0;  
	       int byteread = 0;  
	  
	       URL url = null;  
	       
			    try {  
			        		url = new URL(httpUrl);  
			        		URLConnection conn = url.openConnection();  
			        		InputStream inStream = conn.getInputStream();  
			        		FileOutputStream fs = new FileOutputStream(saveFile);  
			  
			           byte[] buffer = new byte[1204];  
			           
			           while ((byteread = inStream.read(buffer)) != -1) {  
			               bytesum += byteread;  
			               //System.out.println(bytesum);  
			               fs.write(buffer, 0, byteread);  
			           } 
			           return true;
			           
			    } catch (MalformedURLException e1) {  
			        // TODO Auto-generated catch block  
			        e1.printStackTrace();  
			        return false;  
			    } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				}
	   }  
	
	//下载微信头像
	public static String DownloadImage4WXHead(String openid,String url){
		
		String filename = openid+".jpg";
		String  filePath =  "/baodating/sso_project/image4wxhead/";
	
		File file =new File(filePath);    
		//如果文件夹不存在则创建    
		if(!file .exists()  && !file .isDirectory()) {       
		    System.out.println("//不存在");  
		    file .mkdirs();    
		}
		if(WXMediaUtil.httpDownload(url,new File(filePath+filename))){
			return filePath;
		}else{
			return "http://baodating.net.cn/baodating/404.jsp";
		}
	}
	
	//下载图片
	public static String DownloadImage(String qatype,String mediaid,String accesstoken){
		
		String url = "http://file.api.weixin.qq.com/cgi-bin/media/get?access_token="+accesstoken+"&media_id="+mediaid;
		String filename = mediaid+".jpg";

		String  filePath =  "";
        SimpleDateFormat df1 = new SimpleDateFormat("yyyyMMdd");//设置日期格式
	    String  folderName = df1.format(new Date());
	    
		if(qatype.equals("image4a")){
			filePath = "/baodating/sso_project/image4a/"+folderName+"/";
		}else{
			filePath = "/baodating/sso_project/image4q/"+folderName+"/";
			//filePath = System.getProperty("user.dir")+"/baodating/"+folderName+"/";
		}
				
		File file =new File(filePath);    
		//如果文件夹不存在则创建    
		if(!file .exists()  && !file .isDirectory()) {       
		    System.out.println("//不存在");  
		    file .mkdirs();    
		}
		if(WXMediaUtil.httpDownload(url,new File(filePath+filename))){
			return filePath;
		}else{
			return "http://baodating.net.cn/baodating/404.jsp";
		}
	}
	
	//下载语音
	public static  String DownloadVoice(String qatype,String mediaid,String accesstoken){
		
		String url = "http://file.api.weixin.qq.com/cgi-bin/media/get?access_token="+accesstoken+"&media_id="+mediaid;
		String filename = mediaid+".amr";

		String  filePath =  "";
        SimpleDateFormat df1 = new SimpleDateFormat("yyyyMMdd");//设置日期格式
	    String  folderName = df1.format(new Date());
	    
		if(qatype.equals("voice4a")){
			filePath = "/baodating/sso_project/voice4a/"+folderName+"/";
		}else{
			filePath = "/baodating/sso_project/voice4q/"+folderName+"/"; //System.getProperty("user.dir")+
		}
				
		File file =new File(filePath);    
		//如果文件夹不存在则创建    
		if(!file .exists()  && !file .isDirectory()) {       
		    System.out.println("//不存在");  
		    file .mkdirs();    
		}
		if(WXMediaUtil.httpDownload(url,new File(filePath+filename))){
			return filePath;
		}else{
			return "http://baodating.net.cn/baodating/404.jsp";
		}
	}
		
	//下载视频
	public static String DownloadVideo(String qatype,String mediaid,String accesstoken){
		
		String url = "http://file.api.weixin.qq.com/cgi-bin/media/get?access_token="+accesstoken+"&media_id="+mediaid;
		String filename = mediaid+".mp4";

		String  filePath =  "";
        SimpleDateFormat df1 = new SimpleDateFormat("yyyyMMdd");//设置日期格式
	    String  folderName = df1.format(new Date());
	    
		if(qatype.equals("video4a")){
			filePath = "/baodating/sso_project/video4a/"+folderName+"/";
		}else{
			filePath = "/baodating/sso_project/video4q/"+folderName+"/";
		}
				
		File file =new File(filePath);    
		//如果文件夹不存在则创建    
		if(!file .exists()  && !file .isDirectory()) {       
		    System.out.println("//不存在");  
		    file .mkdirs();    
		}
		if(WXMediaUtil.httpDownload(url,new File(filePath+filename))){
			return filePath;
		}else{
			return "http://baodating.net.cn/baodating/404.jsp";
		}
	}


	/**
	 * main(这里用一句话描述这个方法的作用)
	 * (这里描述这个方法适用条件 – 可选)
	 * @param args 
	 *void
	 * @exception 
	 * @since  0.0.1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String s1 = System.getProperty("user.dir")+"/baodating/sso_project/voice4q/20150813/SmaCgMXYwd58u6K4OZJROY7D7-6JfC3DZS3uNypF5Gx79bikIaYJksMfem-zf76_.amr";
		String t1 = "/Users/lihuadong/Documents/Codes/oss_aliyun/amr_list/A.mp3";
		System.out.println(s1);
		System.out.println(t1);
		WXMediaUtil.AMR2MP3(s1, t1);*/
	
		String accesstoken ="F2OXkA6oFcvdHRvyQGGvFuYjpzLkm2cwYceypIcYfYKo1t25fGuWknru8vX6pJsExBx0j4DbxhnQ2NR4JX1bIZkJhCTzT-Ssubf4QFCdOF4";
		String mediaid ="KEeIuUDoFySm2QTpmKpFOUrG_rN9tZfJzUWJvujf_uNiScXVXMeN1XnmMCMaw5wA";
		WXMediaUtil.DownloadImage("image4q", mediaid, accesstoken);
	}

}
