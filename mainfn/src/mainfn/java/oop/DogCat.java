package mainfn.java.oop;


abstract class AnimalBase {  
    abstract void eat();  
}  
  
class CatBase extends AnimalBase {  
    public void eat() {  
        System.out.println("吃鱼");  
    }  
    public void work() {  
        System.out.println("抓老鼠");  
    }  
}  
  
class DogBase extends AnimalBase {  
    public void eat() {  
        System.out.println("吃骨头");  
    }  
    public void work() {  
        System.out.println("看家");  
    }  
}

public class DogCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	      show(new CatBase());  // 以 Cat 对象调用 show 方法
	      show(new DogBase());  // 以 Dog 对象调用 show 方法
	                
//	      AnimalBase a = new CatBase();  // 向上转型  
//	      a.eat();               // 调用的是 Cat 的 eat
//	      CatBase c = (CatBase)a;        // 向下转型  
//	      c.work();        // 调用的是 Cat 的 work
	}
	
	
    public static void show(AnimalBase a)  {
        a.eat();  
          // 类型判断
          if (a instanceof CatBase)  {  // 猫做的事情 
              CatBase c = (CatBase)a;  
              c.work();  
          } else if (a instanceof DogBase) { // 狗做的事情 
              DogBase c = (DogBase)a;  
              c.work();  
          }  
      }  

}
