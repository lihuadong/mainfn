/**
 * 包打听全知道-微信H5版本
 * ipaiban.weixin.util
 * InputStreamUtils.java
 * Ver0.0.1
 * 2014年12月23日-下午7:12:49
 *  2014全智道(北京)科技有限公司-版权所有
 * 
 */
package mainfn.io;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * InputStreamUtils
 * 
 * 李华栋
 * 李华栋
 * 2014年12月23日 下午7:12:49
 * 
 * @version 0.0.1
 * 
 */
public class InputStreamUtils {

	final static int BUFFER_SIZE = 4096;
	
	/**
	 * 将InputStream转换成String
	 * @param in InputStream
	 * @return String
	 * @throws Exception
	 * 
	 */
	public static String InputStreamTOString(InputStream in) throws Exception{
		
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] data = new byte[BUFFER_SIZE];
		int count = -1;
		while((count = in.read(data,0,BUFFER_SIZE)) != -1)
			outStream.write(data, 0, count);
		
		data = null;
		return new String(outStream.toByteArray(),"utf-8");
	}
	
	/**
	 * 将InputStream转换成某种字符编码的String
	 * @param in
	 * @param encoding
	 * @return
	 * @throws Exception
	 */
         public static String InputStreamTOString(InputStream in,String encoding) throws Exception{
		
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] data = new byte[BUFFER_SIZE];
		int count = -1;
		while((count = in.read(data,0,BUFFER_SIZE)) != -1)
			outStream.write(data, 0, count);
		
		data = null;
		return new String(outStream.toByteArray(),"ISO-8859-1");
	}
    
    /**
     * 将String转换成InputStream
     * @param in
     * @return
     * @throws Exception
     */
    public static InputStream StringTOInputStream(String in) throws Exception{
    	
    	ByteArrayInputStream is = new ByteArrayInputStream(in.getBytes("ISO-8859-1"));
    	return is;
    }
    
    /**
     * 将InputStream转换成byte数组
     * @param in InputStream
     * @return byte[]
     * @throws IOException
     */
    public static byte[] InputStreamTOByte(InputStream in) throws IOException{
    	
    	ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] data = new byte[BUFFER_SIZE];
		int count = -1;
		while((count = in.read(data,0,BUFFER_SIZE)) != -1)
			outStream.write(data, 0, count);
		
		data = null;
		return outStream.toByteArray();
    }
    
    /**
     * 将byte数组转换成InputStream
     * @param in
     * @return
     * @throws Exception
     */
    public static InputStream byteTOInputStream(byte[] in) throws Exception{
    	
    	ByteArrayInputStream is = new ByteArrayInputStream(in);
    	return is;
    }
    
    /**
     * 将byte数组转换成String
     * @param in
     * @return
     * @throws Exception
     */
    public static String byteTOString(byte[] in) throws Exception{
    	
    	InputStream is = byteTOInputStream(in);
    	return InputStreamTOString(is);
    }
	
}
