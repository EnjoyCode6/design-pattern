package DesignAbstractFactory;

public class Test2 {

    // 简单工厂模式
    private static final LLMBaseFactory ebClientFactory = new EBClientFactory();

    private static final LLMBaseFactory gptClientFactory = new GPTClientFactory();

    public static void main(String[] args) {
        System.out.println(ebClientFactory.createLLMCLient().chat());
        System.out.println(ebClientFactory.createLLMProClient().chat());
        System.out.println(gptClientFactory.createLLMCLient().chat());
        System.out.println(gptClientFactory.createLLMProClient().chat());
    }

}
