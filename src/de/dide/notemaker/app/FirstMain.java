package de.dide.notemaker.app;

import de.dide.notemaker.model.notestuff.impl.Note;
import util.tui.TuiHelper;
import de.dide.notemaker.model.notestuff.impl.NoteType;

public class FirstMain {
		
	public static void main(String[] args) {
		Note note1 = new Note(NoteType.TEXT, "Notiz1", "der erste Inhalt");
		Note note2 = new Note(NoteType.TEXT, "Notiz2", "der erste Inhalt");

		note1.print();
		note2.print();
	}
	
}
