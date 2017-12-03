package controller.Service;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public enum ResourceManager {
    INSTANCE;

    private ResourceBundle resourceBundle;
    private final String resourseName = "resources.text";
    private  ResourceManager(){
        resourceBundle = ResourceBundle.getBundle(resourseName, Locale.getDefault());
    }

    public void changeResource(Locale locale){
        resourceBundle = ResourceBundle.getBundle(resourseName, locale);

    }

    public String getString(String key){
        return resourceBundle.getString(key);
    }

    public Enumeration getSetKey(){
        return resourceBundle.getKeys();
    }



}
