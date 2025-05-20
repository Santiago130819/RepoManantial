package TestDefinition;

import com.intuit.karate.junit5.Karate;

class LoginTest {

    @Karate.Test
    Karate testLoginValido() {
        return Karate.run("classpath:features/login.feature");
    }
}
