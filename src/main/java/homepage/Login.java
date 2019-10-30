package homepage;

import common.CommonAPI;
import org.junit.Test;

public class Login extends CommonAPI {
        @Test
        public void logintest(){
            clickByXpath("//a[@id='MyAccount']");
            clickByXpath("//span[contains(text(),'Sign in')]");
            typeByXpath("//input[@id='email']","hassan1234@gmail.com");
            typeByXpath("//input[@id='password-input-field']","hassan76khu!");
            clickByXpath("//span[contains(text(),'Sign In')]");

        }


    }
