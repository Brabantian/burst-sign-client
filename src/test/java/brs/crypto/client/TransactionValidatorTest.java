package brs.crypto.client;

import org.junit.Test;

public class TransactionValidatorTest {

  @Test
  public void validateUnsignedTransaction() {
    String transactionString = "001036b75b07a00539dc2e813bb45ff063a376e316b10cd0addd7306555ca0dd2890194d3796015272c647dca5cd540c7b000000000000003f420f"
        + "00000000000000000000000000000000000000000000000000000000000000000000000000def353d5805c7b09241ef71d82b0256a861cd5f743dfe5f901eec9b26e235d093ace"
        + "f18952799c2fbfe41b4241f78052a77f565c2e2923e31a5015776ef170ca00000000ca3c01002f03e8666d92371e";

    TransactionValidator validator = new TransactionValidator();

    validator.validateUnsignedTransaction(Convert.parseHexString(transactionString), 888561138747819634L, 123L, 999999L);
  }
}
