package com.example.mynotes.listener;

import com.example.mynotes.entites.Note;

public interface NotesLisener {

    void onNoteClicked(Note note, int position);

}
