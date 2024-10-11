package DesignAbstractFactory;

import LLM.LLMClient;
import LLMPro.LLMProClient;

public interface LLMBaseFactory {

    public LLMClient createLLMCLient();

    public LLMProClient createLLMProClient();

}
