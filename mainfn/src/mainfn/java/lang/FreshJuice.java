package mainfn.java.lang;

class FreshJuiceShow {
	   enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
	   FreshJuiceSize size;
	}

	 
public class FreshJuice {
   public static void main(String []args){
	   FreshJuiceShow juice = new FreshJuiceShow();
      juice.size = FreshJuiceShow.FreshJuiceSize.MEDIUM  ;
   }
}
