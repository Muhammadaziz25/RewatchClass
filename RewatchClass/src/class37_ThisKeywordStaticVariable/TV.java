package class37_ThisKeywordStaticVariable;

public class TV {

	/*
	 * variables: boolean on, volumeLevel, channel 
	 * constructors: no arg, 1 parameter boolean on, 2 pars volumeLevel, channel, 
	 * 3 pars on, volumeLevel, channel, 
	 */

	boolean on;
	int volumeLevel;
	int channel;

	public TV() {

	}
	public TV(boolean on) {

		this.on = on;
	}

	public TV(int volumeLevel, int channel) {

		this.volumeLevel = volumeLevel;
		this.channel = channel;
	}
	
	public TV(boolean on, int volumeLevel, int channel) {

		this(volumeLevel, channel);
		this.on = on;
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {

		on = false;
	}

	public void volumeUp() {
		if(on)
		volumeLevel +=1;
	}

	public void volumeDown() {
		if (on)
			volumeLevel -= 1;
	}

	public void channelUp() {
		if(on)
			channel +=1;
	}

	public void channelDown() {
		if(on)
			channel -=1;
	}
	
	public void setChannel(int channel) {
		if(on)
		this.channel = channel;
	}
	
	
}
