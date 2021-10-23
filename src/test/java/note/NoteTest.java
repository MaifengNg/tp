package note;

import org.junit.jupiter.api.Test;
import ui.Ui;
import note.NoteList;
import static org.junit.jupiter.api.Assertions.*;

class NoteTest {

    @Test
    public void getNoteContent() {
        Note testingNoteContent = new Note("Test note","DEFAULT",1);
        assertEquals("Test note",testingNoteContent.getNoteContent());
    }

    @Test
    public void getNoteSceneIndex() {
        Note testingNoteIndex = new Note("Test note","DEFAULT",2);
        assertEquals(2,testingNoteIndex.getNoteSceneIndex());
    }

    @Test
    public void getNoteTitle() {
        Note testingNoteTitle = new Note("Test note", "TEST TITLE", 3);
        assertEquals("TEST TITLE", testingNoteTitle.getNoteTitle());
    }
}