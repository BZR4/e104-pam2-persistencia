package br.com.esdras.e104_pam2_persistencia

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DictionarySQLiteHelper(
    context: Context?,
    name: String?,
    version: Int,
    openParams: SQLiteDatabase.OpenParams
) : SQLiteOpenHelper(context, name, version, openParams) {

    companion object {
        const val DATABASE_NAME = "etec104.db"
        const val TABLE_DICTIONARY = "dicionario"
        const val FIELD_WORD = "palavra"
        const val FIELD_DEFINITION = "definicao"
        const val DATABASE_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val sql = "CREATE TABLE $TABLE_DICTIONARY ("
            .plus("id INTEGER PRIMARY KEY, ")
            .plus("$FIELD_WORD TEXT, ")
            .plus("$FIELD_DEFINITION TEXT);")
        db?.execSQL(sql)
    }

    override fun onUpgrade(dn: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    fun insert(word: String, definition: String) : Long {
        val db = writableDatabase
        val contentValues = ContentValues()
        contentValues.put(FIELD_WORD, word)
        contentValues.put(FIELD_DEFINITION, definition)

        return db.insert(TABLE_DICTIONARY, null, contentValues)
    }

    fun update(id: Long, word: String, definition: String) : Int {
        val db = writableDatabase
        val contentValues = ContentValues()
        contentValues.put("id", id)
        contentValues.put(FIELD_WORD, word)
        contentValues.put(FIELD_DEFINITION, definition)

        return db.update(TABLE_DICTIONARY, contentValues, "id = ?", arrayOf(id.toString()))
    }

    fun delete(id: Long) : Int {
        val db = writableDatabase
        return db.delete(TABLE_DICTIONARY, "id = ?", arrayOf(id.toString()))
    }
}