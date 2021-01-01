package JavaSampleProject1.src.Unit3;

public class AccessSpecifiers {
    
    /**
	 * Public Access
	 * Default Access / No Access Specifier
	 * Private Access - limited to the class itself
	 * Protected Access
	 */

    public int a = 100;
	int b = 200;
	private int c = 300;

    public void doThisPublic() {
		System.out.println("Public Method");
    }
    
    private void doThisPrivate() {
		System.out.println("Private Method");
    }
    
    void doThisDefault() {
		System.out.println("Private Method");
	}
	

}
