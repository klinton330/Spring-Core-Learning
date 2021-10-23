package com.hari.AutoWire_Xml_01;

public class Heart {
	
	Pump p;
    Pulse pulse;
	
    public void setPulse(Pulse pulse) {
		this.pulse = pulse;
	}

	
    
	public void setP(Pump p) {
		this.p = p;
	}
	
	public void status()
	{
		if(p!=null)
			p.isPumping();
		else
			System.out.println("Sorry you are died");
	}
	
	public void pulseStatus()
	{
		if(pulse!=null)
		pulse.checkPulse();
		else
		System.out.println("Pulse is not able to check");
	}
}
