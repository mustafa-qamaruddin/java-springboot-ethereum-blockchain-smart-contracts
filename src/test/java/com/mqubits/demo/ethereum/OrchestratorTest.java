package com.mqubits.demo.ethereum;

import org.junit.jupiter.api.Test;
import org.web3j.EVMTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@EVMTest
public class OrchestratorTest {

  @Test
  void testInit() {
    new Orchestrator().init();
    assertEquals(1, 1);
  }
}
