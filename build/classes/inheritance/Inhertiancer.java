package inheritance;

public class Inhertiancer extends Child {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
                System.out.println("Value of a via parent : "+p.a);
                    
		final Parent peepoo;
		
		Parent leepoo = new Parent();
		
		peepoo = leepoo;					
		
		System.out.println(peepoo.method_p1(22, 22));
		
		p.method_p1(1, 2);		
		p.method_p2(2, 4);
		
		
		//System.out.println(p.toBeOverRiddenMethod("Bharat"));
		
		Child c = new Child();
                
                System.out.println("Value of a via child : "+c.a);
		
		String pqr = new String("India");
		System.out.println(c.toBeOverRiddenMethod(pqr));
		
		c.method_c1();
		c.method_c2();
		
		c.method_p1(1, 3);
		c.method_p2(3, 4);
		
		Parent pop = (Parent) new Child();
		
		pop.method_p2(223, 33);
		pop.method_p1(33, 33);
		
		
		Parent poc = new Child();
		
		poc.method_p1(22, 23);
		
		//Child coc = (Child) new Parent();
		
		//coc.method_c1();

	}

}
