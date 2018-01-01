
public class App {

	public static void main(String[] args) {
		HelloWorld h = new HelloWorld();
		h.setName("hi");
		
		HelloWorld h2 = new HelloWorld();
		h.setName("hello");
		
		System.out.println(h.getName()+" " +h2.getName());
	}
}
