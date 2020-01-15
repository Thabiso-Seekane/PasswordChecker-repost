
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PasswordCheck {

    public static boolean passwordIsValid(String password)
    {
        final Logger logger = LogManager.getLogger(Main.class.getName());

        boolean Uppercase = !password.equals(password.toLowerCase());
        boolean Lowercase = !password.equals(password.toUpperCase());
        boolean isAtLeast8 = password.length() >= 8;
        boolean hasNumber  = password.matches(".*\\d.*");
        boolean hasSpecial = !password.matches("[A-Za-z0-9]*");


        if (password.isEmpty())
        {
            logger.error("password should exist.");
            return true;
        }
        if (!isAtLeast8)
        {
            logger.error("password should be longer than 8 characters.");
            return true;
        }
        if (!Lowercase)
        {
            logger.error("password should have at least one lowercase letter");
        }
        if (!Uppercase)
        {
            logger.error("password should have at least one uppercase letter");
        }
        if (!hasNumber)
        {
            logger.error("password should at least have one digit");
        }
        if (!hasSpecial)
        {
            logger.error("password should have at least one special character");
            return true;
        }
        else
        {
            logger.error("Your Password: " + password + " is correct it meets every requirement.");
        }
        return true;
    }

    public static boolean passwordIsOk(String password) {
        final Logger logger = LogManager.getLogger(Main.class.getName());

        String word = password;
        boolean Lowercase = true;
        boolean isAtLeast8 = password.length() >= 8;


        if(password.equals(word) && Lowercase && isAtLeast8)
        {
            logger.info("Password is Okay!");
        }
        else
        {
            logger.error("invalid!");;
        }
        return true;
    }
}
