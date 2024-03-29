package edu.sdsu.cs160l.airplane.engine;

public class Engine {
  private boolean running;

  public boolean isRunning(){
    return running;
  }

  public boolean ignition() throws Exception {
    throw new RuntimeException("Engine team is on a running a bit late on the ignition part, you can mock this function if you like.");
  }

  public void stop(){
    running = false;
  }

}
