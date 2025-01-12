package menu;

import java.util.HashMap;
import java.util.Map;

public final class Example {

    public static void run() {


        //Create the Menu
        Map<String, Command> menu = new HashMap<>();
        menu.put("Cut", new CutCommand());
        menu.put("Copy", new CopyCommand());
        menu.put("Paste", new PasteCommand());

        //User selects item from the menu
        String selection = "Copy";
        //Execute the command
        menu.get(selection).execute();

    }

}

