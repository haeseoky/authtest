package kr.co.falcontag.authtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthtestApplication.class, args);
    }

    @Test
    public void when_callApi_expect_unauthorized() throws Exception {
        mockMvc.perform(get("/users")).andExpect(status().isOk());
    }


}
