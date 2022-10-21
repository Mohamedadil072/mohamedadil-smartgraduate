public class Ex23 {
	adil ex=new adil();
	void manipulate (int a) {
		System.out.println("the number is "+ex.num);
		System.out.println("manipulating a protected member from other class....");
		ex.num=a;
		System.out.println(ex.num);
	}
	public static void main(String[] args) {
		Ex23 ex1=new Ex23();
		ex1.manipulate(5);
		System.out.println("manupulated successfully...");
	}
}
class adil{
	protected int num=10;
}