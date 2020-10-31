package com.mqubits.demo.ethereum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrchestratorTest {
  @Test
  void testInit() {
    new Orchestrator().init();
    assertEquals(1, 1);
  }
}
