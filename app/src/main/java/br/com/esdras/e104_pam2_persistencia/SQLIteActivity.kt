package br.com.esdras.e104_pam2_persistencia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SQLIteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s_q_l_ite_main)
        setTitle(R.string.sqlite_title)
    }
}