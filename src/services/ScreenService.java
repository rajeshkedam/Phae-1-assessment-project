package Virtualkeyscreens;
import Virtualkey.CreateDirectory;


public class ScreenService {

	private static final Virtualkeyscreens.Screen WelcomeScreenImplementsScreen1 = null;

    public static FileOptionsScreenimplementsScreen FileOptionsScreen = new FileOptionsScreenimplementsScreen();
    
    

    public static Screen CurrentScreen = WelcomeScreenImplementsScreen1;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(FileOptionsScreenimplementsScreen fileOptionsScreen2) {
        CurrentScreen = (Screen) fileOptionsScreen2;
    }
    

}
