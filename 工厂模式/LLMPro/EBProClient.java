package LLMPro;

public class EBProClient implements LLMProClient {

    private final String token;

    private final Double temperature;

    private final Integer topP;

    @Override
    public String chat() {
        return "Pro ----" + token + " " + temperature + " " + topP;
    }

    public EBProClient(String token, Double temperature, Integer topP) {
        this.token = token;
        this.temperature = temperature;
        this.topP = topP;
    }

}
