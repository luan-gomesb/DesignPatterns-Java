package com.luangomesb.designPatterns;

interface messageSender {
  public void send();
}

class Letter implements messageSender {
  @Override
  public void send() {
    System.out.println("Send a letter to destiny");
  }
}

class Email implements messageSender {
  @Override
  public void send() {
    System.out.println("Send message by email");
  }
}

class Notifier {
  messageSender ms;

  public void setMs(messageSender ms) {
    this.ms = ms;
  }

  public void sendMessage() {
    ms.send();
  }
}

public class ProgrammingForInterfaces {
  public static void run() {
    Notifier notifier = new Notifier();
    messageSender byEmail = new Email();
    messageSender byLetter = new Letter();
    notifier.setMs(byEmail);
    notifier.sendMessage();
    notifier.setMs(byLetter);
    notifier.sendMessage();
  }

}
