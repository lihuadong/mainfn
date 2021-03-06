/**
 * 包打听全知道-微信H5版本
 * weixin.util
 * Escape.java
 * Ver0.0.1
 * 2016年7月27日-下午5:43:20
 *  2016全智道(北京)科技有限公司-版权所有
 * 
 */
package mainfn.java.io;

/**
 * 
 * Escape
 * 
 * 
 * ECMAScript v3 已从标准中删除了 escape() 函数和 unescape() 函数，并反对使用它们，因此应该使用 decodeURI() 和 decodeURIComponent() 取而代之；
 * 其中某些字符被替换成了十六进制的转义序列，但该方法不会对ASCII字母和数字进行编码，也不会下面这些ASCII标点符号进行编码：*@-_+./，其他所有的字符都会被转义序列替换；
 * https://www.jianshu.com/p/599df12c2b54
 * 李华栋
 * 李华栋
 * 2016年7月27日 下午5:43:20
 * 
 * @version 0.0.1
 * 
 */
public class EscapeUnescape {



	    public static String escape(String src) {
	        int i;
	        char j;
	        StringBuffer tmp = new StringBuffer();
	        tmp.ensureCapacity(src.length() * 6);
	        for (i = 0; i < src.length(); i++) {
	            j = src.charAt(i);
	            if (Character.isDigit(j) || Character.isLowerCase(j)
	                    || Character.isUpperCase(j))
	                tmp.append(j);
	            else if (j < 256) {
	                tmp.append("%");
	                if (j < 16)
	                    tmp.append("0");
	                tmp.append(Integer.toString(j, 16));
	            } else {
	                tmp.append("%u");
	                tmp.append(Integer.toString(j, 16));
	            }
	        }
	        return tmp.toString();
	    }

	    public static String unescape(String src) {
	        StringBuffer tmp = new StringBuffer();
	        tmp.ensureCapacity(src.length());
	        int lastPos = 0, pos = 0;
	        char ch;
	        while (lastPos < src.length()) {
	            pos = src.indexOf("%", lastPos);
	            if (pos == lastPos) {
	                if (src.charAt(pos + 1) == 'u') {
	                    ch = (char) Integer.parseInt(src
	                            .substring(pos + 2, pos + 6), 16);
	                    tmp.append(ch);
	                    lastPos = pos + 6;
	                } else {
	                    ch = (char) Integer.parseInt(src
	                            .substring(pos + 1, pos + 3), 16);
	                    tmp.append(ch);
	                    lastPos = pos + 3;
	                }
	            } else {
	                if (pos == -1) {
	                    tmp.append(src.substring(lastPos));
	                    lastPos = src.length();
	                } else {
	                    tmp.append(src.substring(lastPos, pos));
	                    lastPos = pos;
	                }
	            }
	        }
	        return tmp.toString();
	    }

	    public static void main(String[] args) {
	        String tmp = "中文";
	        System.out.println("testing escape : " + tmp);
	        tmp = escape(tmp);
	        System.out.println(tmp);
	        System.out.println("testing unescape :" + tmp);
	        System.out.println(unescape("%u6211%u4eec"));
	    }

}
