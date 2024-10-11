package DesignFactoryMethod;

import LLM.EBClient;
import LLM.LLMClient;

public class EBClientFactory implements LLMBaseFactory{
    @Override
    public LLMClient createLLMCLient() {
        return new EBClient(createToken(), createTemperature(), createTopP());
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
