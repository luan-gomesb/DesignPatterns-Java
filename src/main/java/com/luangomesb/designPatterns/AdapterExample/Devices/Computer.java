package com.luangomesb.designPatterns.AdapterExample.Devices;

import com.luangomesb.designPatterns.AdapterExample.Interfaces.HDMI;

public class Computer {
  private HDMI port;
  public void connectPort(HDMI monitor){
    this.port = monitor;
  }
  public void play(String image, String sound){
    if(port == null){
      System.out.println("You need do connectPort before");
    }else{
      port.setImage(image);
      port.setSound(sound);
    }
  }
}
