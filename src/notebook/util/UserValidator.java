package notebook.util;

public class UserValidator {
    public String isNameValid (String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Name is empty");
        }
        return name.trim().replaceAll(" ", "");
    }

}
