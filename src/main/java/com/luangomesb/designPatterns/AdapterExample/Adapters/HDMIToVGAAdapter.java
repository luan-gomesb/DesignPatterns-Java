package com.luangomesb.designPatterns.AdapterExample.Adapters;

import com.luangomesb.designPatterns.AdapterExample.Interfaces.HDMI;
import com.luangomesb.designPatterns.AdapterExample.Interfaces.VGA;

public class HDMIToVGAAdapter implements HDMI {
  VGA port;

  public HDMIToVGAAdapter(VGA port) {
    System.out.println("HDMIToVGAAdapter -- Object Adapter");
    this.port = port;
  }

  @Override
  public void setImage(String image) {
    port.setImage(image); 
  }

  @Override
  public void setSound(String sound) {
    System.out.println("VGA Adaptor does not support HDMI sound");
    
  }
  
}
