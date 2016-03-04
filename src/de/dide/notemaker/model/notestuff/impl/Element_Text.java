package de.dide.notemaker.model.notestuff.impl;

import util.tui.TuiHelper;

public class Element_Text extends NoteElement {
	
	private String text;
		
	public Element_Text(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		
		StringBuilder result = new StringBuilder(super.toString());
		result.append(TuiHelper.paintString(TuiHelper.COL_BLUE_OWN, "function Element_Text.toString(): \n"));
		result.append(text);
		return result.toString();
	}
	
}