package test;

public class ProduceConsume {
  public static void main(String[] args) {
    Buffer b = new Buffer();
    Consumer c = new Consumer(b);
    Producer p = new Producer(b,1);
    c.start();
    p.start();
  }
}
