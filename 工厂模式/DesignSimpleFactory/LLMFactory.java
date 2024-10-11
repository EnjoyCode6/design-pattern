package DesignSimpleFactory;

import LLM.EBClient;
import LLM.GPTClient;
import LLM.LLMClient;

public class LLMFactory {

    public LLMClient createLLMClient(String name) {
        if ("gpt".equals(name)) {
            return new GPTClient(createEbToken(), createEbTemperature(), createEbTopP());
        }
        if ("eb".equals(name)) {
            return new EBClient(createGptToken(), createGptTemperature(), createGptTopP());
        }
        return null;
    }

    private String createEbToken() {
        return "ebToken method";
    }

    private Integer createEbTopP() {
        return 1;
    }

    private Double createEbTemperature() {
        return 0.8;
    }

    private String createGptToken() {
        return "gptToken method";
    }

    private Integer createGptTopP() {
        return 2;
    }

    private Double createGptTemperature() {
        return 0.5;
    }

}
