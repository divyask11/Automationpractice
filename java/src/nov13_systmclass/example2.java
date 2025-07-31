package nov13_systmclass;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userhomelocation=System.getProperty("user.home");
		
		System.out.println("user home location:"+System.getProperty("user.home"));
		// it give u home location
		
		System.out.println("work diarectory:"+System.getProperty("user.dir"));
		// IT GIVE WORKSPACE YOU USE 
		
		System.out.println("os name:"+System.clearProperty("os.name"));
		// it give you your laptop os 
		
		System.out.println("java version:"+System.clearProperty("java.version"));
		// it give u your java version u use 
		
		
		System.out.println("time:"+System.currentTimeMillis());
		// it give ur time live in millisecond 
		
		System.out.println("nano time:" +System.nanoTime());
		
		
		System.clearProperty("user.home");
		System.out.println("user home location:"+System.clearProperty("user.home"));
		// it remove ur home location 
		
		
		System.setProperty("user.home","F:\\userhome");
		System.out.println("user home location:"+System.getProperty("user.home"));
		// update nerw home location 
		
		
		System.exit(0);// it will terminate the program  execution
		System.out.println("stop");
		
		
	}

}
