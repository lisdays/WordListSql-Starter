package com.android.example.wordlistsql;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import static android.content.ContentValues.TAG;
import static com.android.example.wordlistsql.WordListOpenHelper.KEY_ID;
import static com.android.example.wordlistsql.WordListOpenHelper.KEY_WORD;

/**
 * Created by MU-09 on 27/11/2017.
 */

public class WordItem {

    private int mId;
    private String mWord;

    public WordItem() {}

    public int getId() {
        return this.mId;
    }

    public String getWord() {
        return this.mWord;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public void setWord(String word) {
        this.mWord = word;
    }
}
