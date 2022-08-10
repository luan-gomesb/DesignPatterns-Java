package com.luangomesb.designPatterns.AdapterExample.Devices;

import com.luangomesb.designPatterns.AdapterExample.Interfaces.VGA;

public class OldMonitor implements VGA {

  @Override
  public void setImage(String image) {
    System.out.println("VGA Image: " + image); 
  }

}
