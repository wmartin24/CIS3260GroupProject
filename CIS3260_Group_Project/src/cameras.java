
public class Cameras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
}
 String Brand = "Sony";
 String Color = "Black";
 int screenSize=6;
 final int resolution=1080;
	boolean isFlashOn; 
	int numberOfUSBInputs;
	double price;
	
	boolean status; 
	

    void turnOn(){
		this.status = true;
		System.out.println("Camera Flash is On");
    }
		
	void turnOff(){
			this.status = false;
			System.out.println("Camera Flash is off");
		}
	
     void turnflashOn(){
		this.status = true;
		System.out.println("Camera Flash is On");
	}
	
	void turnflashOff(){
		this.status = false;
		System.out.println("Camera Flash is off");
	}

}

