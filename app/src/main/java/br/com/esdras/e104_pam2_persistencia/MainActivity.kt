package br.com.esdras.e104_pam2_persistencia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun doOpenActivity(view: View) {
        when(view.id) {
            R.id.cardViewSharedPreferences ->
                startActivity(Intent(this, SharedPreferenceActivity::class.java))
            R.id.cardViewSQLite ->
                startActivity(Intent(this, SQLIteActivity::class.java))
            R.id.cardViewFirebase ->
                startActivity(Intent(this, FirebaseActivity::class.java))
        }
    }
}