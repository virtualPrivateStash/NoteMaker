package de.dide.notemaker.model.notestuff.impl;

import de.dide.notemaker.model.notestuff.INoteElement;
import util.tui.TuiHelper;

public class NoteElement implements INoteElement{

	String title;
	String[] content;
	NoteType type;


	public NoteElement() {
		title = "dummytitle";
		//String[] numbers = {"one", "two"};
	}

	@Override
	public String getTitle() {
		return title;
	}

	public String[] getContent() {
		return content;
	}

	public NoteType getType() {
			return type;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(TuiHelper.paintString(TuiHelper.COL_BLUE_OWN, "function NoteElement.toString(): \n"));
		return sb.toString();
	}

}
