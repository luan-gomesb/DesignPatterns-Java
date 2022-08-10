package com.luangomesb.designPatterns.AdapterExample.Devices;

import com.luangomesb.designPatterns.AdapterExample.Interfaces.HDMI;

public class NewMonitor  implements HDMI {

  @Override
  public void setImage(String image) {
    // TODO Auto-generated method stub
   System.out.println("HDMI video: " + image);
  }

  @Override
  public void setSound(String sound) {
    // TODO Auto-generated method stub
    System.out.println("HDMI Sound: " + sound);
    
  }
  
}
