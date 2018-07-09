package brs.crypto.client;

import org.junit.Test;

public class MessageSigningClientTest {

  @Test
  public void signTransactionTest() {
    final byte[] message = "message".getBytes();
    final String secretPhrase = "ach wie gut dass niemand weiss dass ich Rumpelstilzchen heiss";

    StringBuilder sb = new StringBuilder();
    sb.append("[ ");
    for (byte b : MessageSigningClient.sign(message, secretPhrase)) {
      sb.append(String.format("0x%02X ", b));
    }
    sb.append("]");

    System.out.println(sb.toString());
  }
}
