package de.dide.notemaker.model.notestuff;

import java.util.Date;

public interface INote {
	String getTitle();
	Date getDateOfCreation();
	Date getDateOfLastChange();
}
