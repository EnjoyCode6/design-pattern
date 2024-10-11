package DesignFactoryMethod;

import DesignFactoryMethod.EBClientFactory;
import DesignFactoryMethod.GPTClientFactory;
import DesignFactoryMethod.LLMBaseFactory;

public class Test1 {

    // 工厂方法模式

    private static final LLMBaseFactory ebClientFactory = new EBClientFactory();
    private static final LLMBaseFactory gptClientFactory = new GPTClientFactory();

    public static void main(String[] args) {
        System.out.println(ebClientFactory.createLLMCLient().chat());
        System.out.println(gptClientFactory.createLLMCLient().chat());
    }

}
