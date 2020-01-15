import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static void main(String[] args){

        final Logger logger = LogManager.getLogger(Main.class.getName());

        Scanner input = new Scanner(System.in);
        PasswordCheck pass = new PasswordCheck();

        logger.info("please create a password:");
        String password = input.nextLine();

        pass.passwordIsValid(password);
        pass.passwordIsOk(password);
    }
}
