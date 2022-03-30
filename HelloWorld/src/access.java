
public class access {
	 

	public static void main(String[] args) {
		privateaccess p1=privateaccess.accessmethod();
		p1.display();
		privateaccess p2=privateaccess.accessmethod(45);
		p2.display();
	}
 }



class privateaccess{
	public static privateaccess ob=null;
	public static privateaccess oj=null;
	private privateaccess() {
		
	}
    private privateaccess(int i) {
		System.out.println(i);
	}
    
    void display() {
    	System.out.println("ok");
    }
    public static privateaccess accessmethod() {
    	if(ob==null) {
    		ob=new privateaccess();
    	}
    	System.out.println(ob);
    	return ob;
    		
    }
    public static privateaccess accessmethod(int i) {
    	if(oj==null) {
    		oj=new privateaccess(40);
    	}
    	System.out.println(oj);
    	return oj;
    		
    }
    
}