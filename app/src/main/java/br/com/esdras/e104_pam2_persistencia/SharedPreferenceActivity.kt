package br.com.esdras.e104_pam2_persistencia

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class SharedPreferenceActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var textInputLayout: TextInputLayout

    companion object {
        val NAME = "name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)
        setTitle(R.string.shared_preference_title);

        textView = findViewById(R.id.textViewName)
        textInputLayout = findViewById(R.id.textInputLayoutName)


        val sharedPreferences = getPreferences(MODE_PRIVATE)

        val name = sharedPreferences.getString(NAME, null)

        if (name != null) {
            textView.text = name
        } else {
            textView.text = ""
        }
    }

    fun saveName(view: View) {
        val editor = getPreferences(MODE_PRIVATE).edit()
        editor.putString(NAME, textInputLayout.editText!!.text.toString())
        editor.apply()
    }
}