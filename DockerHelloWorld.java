import redis.clients.jedis.Jedis;

public class DockerHelloWorld {
  public static void main(String[] args) {
    Jedis jedis = new Jedis("redis");
    System.out.println("Hello world from Docker!");
    System.out.println("Server is running: " + jedis.ping());
  }
}
