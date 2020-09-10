
public class SMS {
    NexmoClient client = new NexmoClient.Builder()
            .apiKey("******")
            .apiSecret("******")
            .build();

    String messageText = "Hello from Vonage SMS API";
    TextMessage message = new TextMessage("Vonage APIs", "886XXXXXXXXX", messageText);

    SmsSubmissionResponse response = client.getSmsClient().submitMessage(message);

for (SmsSubmissionResponseMessage responseMessage : response.getMessages()) {
        System.out.println(responseMessage);
    }
}
