package Entity;

import Messages.ExceptionMessages;

public final class Validation {
    public static void validationName(String name){
        if (name == null || name == " ") {
            throw new IllegalArgumentException(ExceptionMessages.nameNull);
        }
    }
}
