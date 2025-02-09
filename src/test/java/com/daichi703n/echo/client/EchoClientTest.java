package com.daichi703n.echo.client;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.net.UnknownHostException;

import org.junit.jupiter.api.Test;

class EchoClientTest {

    @Test
    void sendMessage_thenCorrect() throws IOException {
        try (EchoClient client = new EchoClient("127.0.0.1", 8888)) {
            String expected1 = "Hello world!";
            String actual1 = client.sendMessage("Hello world!");
            assertEquals(expected1, actual1);

            String expected2 = "bye";
            String actual2 = client.sendMessage(".");
            assertEquals(expected2, actual2);
        }
    }
}
