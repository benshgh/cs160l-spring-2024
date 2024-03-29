package edu.sdsu.cs160l.airplane;


import edu.sdsu.cs160l.airplane.engine.Engine;
import edu.sdsu.cs160l.airplane.wheel.Wheel;
import edu.sdsu.cs160l.airplane.wheel.WheelStatus;

public class Airplane {
  private Engine engine;
  private Wheel wheel;

  public Airplane() {
    this.engine = new Engine();
    this.wheel = new Wheel();
  }

  public boolean start() throws Exception {
      if(engine.isRunning()){
        throw new RuntimeException("Engine is already running");
      }
      engine.ignition();
      return engine.isRunning();
  }

  public void stop(){
    engine.stop();
  }

  public WheelStatus takeOff(){
    wheel.wheelUp();
    return wheel.getWheelStatus();
  }

  public WheelStatus land(){
    wheel.wheelDown();
    wheel.brake();
    return wheel.getWheelStatus();
  }

}
