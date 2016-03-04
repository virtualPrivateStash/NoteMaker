package de.dide.notemaker.model.notestuff.impl;

import java.util.Date;

import com.sun.xml.internal.messaging.saaj.soap.impl.ElementFactory;

import de.dide.notemaker.model.notestuff.INote;
import util.tui.TuiHelper;

public class Note implements INote{
	
	private String title;
	private Date dateOfCreation;
	private Date dateOfLastChange;
	NoteType type;
	NoteElement element;

	NoteElementFactory elementFactory;
	
	public Note(NoteType type, String title, String text) {
		this.title = title;
		dateOfCreation = new Date();
		elementFactory = new NoteElementFactory();
		element = elementFactory.createNoteElement(type, text);
	}
	
	public NoteElement getElement() {
		return element;
	}
	
	@Override
	public String getTitle() {
		return title;
	}
	@Override
	public Date getDateOfCreation() {
		return dateOfCreation;
	}
	@Override
	public Date getDateOfLastChange() {
		return dateOfLastChange;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("method Note.toString(): \n");
		sb.append("Title: " + title + "\n");
		sb.append("Date of Creation: " + dateOfCreation + "\n");
		return (sb.toString());
	}

	public void print() {
		StringBuilder sb = new StringBuilder();
		sb.append(TuiHelper.paintString(TuiHelper.COL_BLUE_OWN, "function Note.print():"));
		sb.append("\n######## START OF NOTE " + title + " #######" + "\n");
		sb.append("nameOfNote: " + title + "\n");
		sb.append("erzeugt am: " + dateOfCreation + "\n");
		sb.append(element.toString());
		sb.append("\n########  END OF NOTE " + title + " ########" + "\n");
		System.out.println(sb.toString());
	}

}
