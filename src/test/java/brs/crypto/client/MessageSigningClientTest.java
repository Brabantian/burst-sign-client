package brs.crypto.client;

import org.junit.Test;

public class MessageSigningClientTest {

  @Test
  public void signTransactionTest() {
    final byte[] message = "001036b75b07a00539dc2e813bb45ff063a376e316b10cd0addd7306555ca0dd2890194d3796015272c647dca5cd540c7b000000000000003f420f00000000000000000000000000000000000000000000000000000000000000000000000000def353d5805c7b09241ef71d82b0256a861cd5f743dfe5f901eec9b26e235d093acef18952799c2fbfe41b4241f78052a77f565c2e2923e31a5015776ef170ca00000000ca3c01002f03e8666d92371e".getBytes();
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
