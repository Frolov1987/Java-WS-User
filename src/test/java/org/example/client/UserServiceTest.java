package org.example.client;

import org.example.client.generated.Sex;
import org.example.client.generated.UserService;
import org.example.client.generated.UserServiceImplService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    static UserServiceImplService service;
    static UserService userService;

    @BeforeAll
    static void setup(){
        service = new UserServiceImplService();
        userService = service.getUserServiceImplPort();
    }

    @Test
    void givenUserService_whenUserPhone_thenCurrencyUserIsMarta(){
        assertEquals("554 546-5655",userService.findByName("Marta").getPhone());
    }
    @Test
    void givenUserService_whenUserIsMark_thenCurrencyAge18(){
        assertEquals(18,userService.findByName("Mark").getAge());
    }

    @Test
    void givenUserService_whenUserAlice_thenCurrencySex(){
        assertEquals(Sex.FEMALE,userService.findByName("Alice").getSex());
    }
}
