package com.luangomesb.designPatterns.AdapterExample.Adapters;

import com.luangomesb.designPatterns.AdapterExample.Devices.OldMonitor;
import com.luangomesb.designPatterns.AdapterExample.Interfaces.HDMI;

public class HDMIToOldMonitorAdater extends OldMonitor implements HDMI {

  @Override
  public void setImage(String image) {
    System.out.println("HDMIToOldMonitorAdapter -- Class Adapter");
    super.setImage(image);
  }

  @Override
  public void setSound(String sound) {
    System.out.println("Old monitor does not support HDMI sound"); 
  }
  
}
