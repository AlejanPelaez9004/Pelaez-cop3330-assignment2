package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicEightBallTest {

    @Test
    public void response1(){
        String response = MagicEightBall.RandomResponse(0);
        assertEquals("Yes.", response);
    }
    @Test
    public void response2(){
        String response = MagicEightBall.RandomResponse(1);
        assertEquals("No.", response);
    }
    @Test
    public void response3(){
        String response = MagicEightBall.RandomResponse(2);
        assertEquals("Maybe.", response);
    }
    @Test
    public void response4(){
        String response = MagicEightBall.RandomResponse(3);
        assertEquals("Ask again later.", response);
    }
}