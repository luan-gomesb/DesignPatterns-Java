package com.luangomesb.designPatterns.AdapterExample;

import com.luangomesb.designPatterns.AdapterExample.Adapters.HDMIToOldMonitorAdater;
import com.luangomesb.designPatterns.AdapterExample.Adapters.HDMIToVGAAdapter;
import com.luangomesb.designPatterns.AdapterExample.Devices.Computer;
import com.luangomesb.designPatterns.AdapterExample.Devices.NewMonitor;
import com.luangomesb.designPatterns.AdapterExample.Devices.OldMonitor;
import com.luangomesb.designPatterns.AdapterExample.Interfaces.HDMI;

public class AdapterExampleShow {
  public static void run(){
    AdapterExampleShow.objectExample();
    System.out.println("");
    AdapterExampleShow.classExample();
  }
  private static void classExample(){
    Computer pc = new Computer();
    HDMI monitor = new HDMIToOldMonitorAdater();
    pc.connectPort(monitor);
    pc.play("Pantera's show","Mouth for war"); 
 
  }
  private static void objectExample(){
    Computer pc = new Computer();
    OldMonitor oldmonitor = new OldMonitor();
    HDMI monitor = new HDMIToVGAAdapter(oldmonitor);
    pc.connectPort(monitor);
    pc.play("Metallica show", "...And Justice For All");
  }
}
