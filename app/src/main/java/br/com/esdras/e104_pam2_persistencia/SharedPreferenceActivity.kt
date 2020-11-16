package br.com.esdras.e104_pam2_persistencia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SharedPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)
        setTitle(R.string.shared_preference_title);

        var textView = findViewById<TextView>(R.id.textViewName)


    }
}