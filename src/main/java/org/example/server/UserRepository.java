package org.example.server;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private static final Map<String, User> users = new HashMap<>();

    static {
        initData();
    }

    private static void initData() {
        User marta = new User();
        marta.setName("Marta");
        marta.setPhone("554 546-5655");
        marta.setAge(21);
        marta.setSex(Sex.MALE);

        users.put(marta.getName(), marta);


        User mark = new User();
        mark.setName("Mark");
        mark.setPhone("554 586-5995");
        mark.setAge(18);
        mark.setSex(Sex.MALE);

        users.put(mark.getName(), mark);


        User alice = new User();
        alice.setName("Alice");
        alice.setPhone("554 877-7789");
        alice.setAge(30);
        alice.setSex(Sex.FEMALE);

        users.put(alice.getName(), alice);
    }

    public User findUser(String name) {
        return users.get(name);
    }
}
