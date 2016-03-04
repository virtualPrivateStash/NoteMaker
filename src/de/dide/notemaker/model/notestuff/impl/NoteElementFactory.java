package de.dide.notemaker.model.notestuff.impl;

import de.dide.notemaker.model.notestuff.impl.NoteType;

public class NoteElementFactory {

	public NoteElementFactory() {}
	
	public NoteElement createNoteElement(NoteType type, String text) {
		NoteElement element;
		switch(type)
		{
			case TEXT: 
				element = new Element_Text(text);
				break;
			case LINK:
			//falls null return leeres NoteElement zum ausfüllen(?)
			default:
				element = new Element_Text(text);

		}
		return element;
	}

}