package DesignSimpleFactory;

public class Test3 {

    private static final LLMFactory llmFactory = new LLMFactory();

    public static void main(String[] args) {
        System.out.println(llmFactory.createLLMClient("gpt").chat());
        System.out.println(llmFactory.createLLMClient("eb").chat());
    }
}
