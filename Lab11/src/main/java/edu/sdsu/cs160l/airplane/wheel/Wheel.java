package edu.sdsu.cs160l.airplane.wheel;

public class Wheel {
  private WheelStatus wheels;

  public Wheel() {
    wheels = new WheelStatus(false, false);
  }

  public WheelStatus wheelUp() {
    throw new UnsupportedOperationException("Hey the wheels aren't built yet, do you mind mocking it for your testing, cheers");
//    if(!wheels.isRunning()){
//      throw new RuntimeException("You cant wheel up when plane is stationary");
//    }
//    wheels = new WheelStatus(true, true);
//    return wheels;
  }

  public WheelStatus wheelDown() {
    throw new UnsupportedOperationException("Hey the wheels aren't built yet, do you mind mocking it for your testing, cheers");
//    wheels = new WheelStatus(false, true);
//    return wheels;
  }

  public WheelStatus brake() {
    throw new UnsupportedOperationException("Hey the wheels aren't built yet, do you mind mocking it for your testing, cheers");
//    wheels = new WheelStatus(false, false);
//    return wheels;
  }

  public WheelStatus getWheelStatus() {
    throw new UnsupportedOperationException("Hey the wheels aren't built yet, do you mind mocking it for your testing, cheers");
//    return wheels;
  }
}
