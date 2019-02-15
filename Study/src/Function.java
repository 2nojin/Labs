
public class Function {
	public boolean power;	
	public boolean bluetooth;
	public boolean prop;
	public void power_on() {
		power = true;
	}

	public void power_off() {
		power = false;
	}


	public void blue_on() {
		bluetooth = true;
	}
	
	public void blue_off() {
		bluetooth = false;
	}
	
	public void fold() { //받침대가 접힘
		prop = false;
	}
	public void unfold() {//받침
		prop = true;
	}
}
