package it.insubria.protezionet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Pagina principale dell'app con il Login, associato a activity_main.xml

/**
 *
 *  Entry point dell'app (finestra di login)
 *
 **/
class LoginActivity : AppCompatActivity() {

    val TITOLO = "ProtezioNET Admin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = TITOLO

        /// NUOVO PER COMMIT

        // commit 2

        // Commit 3

        // Commit 4 -Manu

    }
}