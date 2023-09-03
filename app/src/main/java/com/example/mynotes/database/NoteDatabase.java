package com.example.mynotes.database;

import android.content.Context;
import android.provider.ContactsContract;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.mynotes.dao.NoteDao;
import com.example.mynotes.entites.Note;

@Database(entities = Note.class, version = 1, exportSchema = false)

public abstract class NoteDatabase extends RoomDatabase {

    private static NoteDatabase noteDatabase;
    public static synchronized NoteDatabase getNoteDatabase(Context context){
        if (noteDatabase == null){
            noteDatabase = Room.databaseBuilder(
                    context,
                    NoteDatabase.class,
                    "notes_db"
            ).build();
        }
        return noteDatabase;
    }

    public abstract NoteDao noteDao();


}
