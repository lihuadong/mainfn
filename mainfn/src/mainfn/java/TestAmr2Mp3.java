/**
 * 包打听全知道-微信H5版本
 * jave
 * TestAmr2Mp3.java
 * Ver0.0.1
 * 2017年2月16日-上午10:38:40
 *  2017全智道(北京)科技有限公司-版权所有
 * 
 */
package mainfn.java;


import java.io.File;
import java.io.IOException;

/**
 * 
 * TestAmr2Mp3
 * 
 * 李华栋
 * 李华栋
 * 2017年2月16日 上午10:38:40
 * 
 * @version 0.0.1
 * 
 */
public class TestAmr2Mp3 {

	/**
	 * main(这里用一句话描述这个方法的作用)
	 * (这里描述这个方法适用条件 – 可选)
	 * @param args 
	 *void
	 * @exception 
	 * @since  0.0.1
	 */
	public static void main(String[] args) {
		
		File source = new File("/data/data4img/wukonglai_live/lihuadong_live_demo/2017_02_15_23_42_56.amr");
		File target = new File("/data/data4img/wukonglai_live/lihuadong_live_demo/2017_02_15_23_42_56.mp3");
/*		AudioAttributes audio = new AudioAttributes();
		audio.setCodec("libmp3lame"); //libamr_nb  libamr_wb libmp3lame
		//audio.setBitRate(new Integer(128000));
		//audio.setChannels(new Integer(2));
		//audio.setSamplingRate(new Integer(44100));
		
		EncodingAttributes attrs = new EncodingAttributes();
		attrs.setFormat("mp3");
		attrs.setAudioAttributes(audio);
		Encoder encoder = new Encoder();
		try {  
            encoder.encode(source, target, attrs);  
        } catch (IllegalArgumentException e) {  
            e.printStackTrace();  
        } catch (InputFormatException e) {  
            e.printStackTrace();  
        } catch (EncoderException e) {  
            e.printStackTrace();  
        } */
		
		Runtime mt =Runtime.getRuntime();
		//File  ffmpeg =new File("/usr/bin","ffmpeg");
		try {
			mt.exec("ffmpeg -i "+"/data/data4img/wukonglai_live/lihuadong_live_demo/2017_02_15_22_44_00.amr  /data/data4img/wukonglai_live/lihuadong_live_demo/2017_02_15_22_44_00.mp3");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
