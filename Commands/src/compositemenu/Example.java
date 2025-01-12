package compositemenu;

public final class Example {
    public static void run() {
        CompositeMenuItem menu = new CompositeMenuItem("Edit");
        LeafMenuItem cut = new LeafMenuItem(menu, "Cut", new CutCommand());
        LeafMenuItem copy = new LeafMenuItem(menu, "Copy", new CopyCommand());
        menu.add(cut);
        menu.add(copy);

        CompositeMenuItem subMenu = new CompositeMenuItem(menu, "Paste");
        LeafMenuItem pasteFormatted = new LeafMenuItem(subMenu, "Paste Formatted", new PasteFormattedCommand());
        LeafMenuItem pastePlain = new LeafMenuItem(subMenu, "Paste as Plain Text", new PasteAsPlainTextCommand());
        subMenu.add(pasteFormatted);
        subMenu.add(pastePlain);
        menu.add(subMenu);

        LeafMenuItem delete = new LeafMenuItem(menu, "Delete", new DeleteCommand());
        menu.add(delete);

        menu.display();

    }

}
