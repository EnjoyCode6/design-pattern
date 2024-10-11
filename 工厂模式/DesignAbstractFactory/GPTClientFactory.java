package DesignAbstractFactory;

import LLM.GPTClient;
import LLM.LLMClient;
import LLMPro.GPTProClient;
import LLMPro.LLMProClient;

public class GPTClientFactory implements LLMBaseFactory {
    @Override
    public LLMClient createLLMCLient() {
        return new GPTClient(createToken(), createTemperature(), createTopP());
    }

    @Override
    public LLMProClient createLLMProClient() {
        return new GPTProClient(createToken(), createTemperature(), createTopP());
    }

    public String createToken() {
        return "gptToken method";
    }

    public Integer createTopP() {
        return 2;
    }

    public Double createTemperature() {
        return 0.5;
    }

}
