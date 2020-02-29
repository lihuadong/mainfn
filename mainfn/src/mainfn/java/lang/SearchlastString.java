package mainfn.java.lang;

public class SearchlastString {

	  public static void main(String[] args) {
	      String strOrig = "Hello world ,Hello fullstackeer";
	      int lastIndex = strOrig.lastIndexOf("fullstackeer");
	      if(lastIndex == - 1){
	         System.out.println("没有找到字符串 fullstackeer");
	      }else{
	         System.out.println("fullstackeer 字符串最后出现的位置： "+ lastIndex);
	      }
	  }
}
