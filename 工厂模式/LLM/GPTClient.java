package LLM;

public class GPTClient implements LLMClient{

    private final String token;

    private final Double temperature;

    private final Integer topP;

    @Override
    public String chat() {
        return token + " " + temperature + " " + topP;
    }

    public GPTClient(String token, Double temperature, Integer topP) {
        this.token = token;
        this.temperature = temperature;
        this.topP = topP;
    }
}
