package io.turntabl.threads;

public class Uncaught {
  public static void main(String[] args) throws InterruptedException{
  
    Thread.setDefaultUncaughtExceptionHandler((t, e) ->
    {
      System.err.println("uncaught exception: " +
        e.getMessage());
    });
    
    throw new InterruptedException();
  }
}
