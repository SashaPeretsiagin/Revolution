namespace java com.angelomelonas.thriftwebchat

service ChatService {
    // Clients first subscribe to be able to send messages.
    Message subscribe(1: SubscriptionRequest subscriptionRequest)

    Message unsubscribe(1: UnsubscriptionRequest unsubscriptionRequest)

    Message sendMessage(1: MessageRequest messageRequest);

    list<Message> getMessages(MessagesRequest messagesRequest);
}



service PrivateChatService {
    Message sendMessage(1: MessageRequest messageRequest);

    list<Message> getMessages(1: MessagesRequest messagesRequest);
}



struct Message {
    1: string message;
    2: string username;
    3: i64 timestamp;
}

struct MessageRequest {
    1: string username;
    2: string message;
}

struct SubscriptionRequest{
    1: string username;
}

struct UnsubscriptionRequest{
    1: string username;
}

struct MessagesRequest{
    1: string username;
}

struct PrivatMessages{
    1: i64 chatId;
    2: list<Message> messages;
}
