package DesignAbstractFactory;

import LLM.EBClient;
import LLM.LLMClient;
import LLMPro.EBProClient;
import LLMPro.LLMProClient;

public class EBClientFactory implements LLMBaseFactory {
    @Override
    public LLMClient createLLMCLient() {
        return new EBClient(createToken(), createTemperature(), createTopP());
    }

    @Override
    public LLMProClient createLLMProClient() {
        return new EBProClient(createToken(), createTemperature(), createTopP());
    }

    public String createToken() {
        return "ebToken method";
    }

    public Integer createTopP() {
        return 1;
    }

    public Double createTemperature() {
        return 0.8;
    }

}
