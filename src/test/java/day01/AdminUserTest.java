package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void testAdminUser(){
        User user = new AdminUser("admin@gmail.com", "titkos");
        assertEquals("*".repeat(6), user.getPassword());

    }


}