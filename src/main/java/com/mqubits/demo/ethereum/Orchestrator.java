package com.mqubits.demo.ethereum;

import java.io.IOException;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.core.methods.response.EthBlockNumber;
import org.web3j.protocol.core.methods.response.EthGasPrice;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;

public class Orchestrator {
    public void init() {
        Web3j web3 = Web3j.build(new HttpService("<NODE ENDPOINT>"));

    }
}
