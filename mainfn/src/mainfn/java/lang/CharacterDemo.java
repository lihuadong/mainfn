package mainfn.java.lang;

public class CharacterDemo {
	
	public static void main(String args[]) {

		char ch = 'a';
		// Unicode 字符表示形式
		char uniChar = '\u039A';
		// 字符数组
		char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

		Character ch1 = new Character('a');
		System.out.println(Character.isLetter('A'));
		System.out.println("访问\"Main function教程!\"");

	}
}
