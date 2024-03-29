package edu.sdsu.cs160l.airplane.wheel;

public class WheelStatus {
  private boolean isWheelUp;
  private boolean running;

  public WheelStatus(boolean isWheelUp, boolean running) {
    this.isWheelUp = isWheelUp;
    this.running = running;
  }

  public boolean isWheelUp() {
    return isWheelUp;
  }

  public boolean isRunning() {
    return running;
  }
}
