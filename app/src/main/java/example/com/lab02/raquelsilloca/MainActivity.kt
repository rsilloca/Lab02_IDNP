package example.com.lab02.raquelsilloca

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cui = findViewById(R.id.input_cui) as EditText
        var dni = findViewById(R.id.input_dni) as EditText
        var firstName = findViewById(R.id.input_first_name) as EditText
        var lastName = findViewById(R.id.input_last_name) as EditText
        var dateOfBirth = findViewById(R.id.input_date_of_birth) as EditText
        var email = findViewById(R.id.input_email) as EditText

        var btnSend = findViewById(R.id.btn_send) as Button

        btnSend.setOnClickListener(View.OnClickListener { view ->
            Log.d("CUI: ", cui.text.toString())
            Log.d("DNI: ", dni.text.toString())
            Log.d("First Name: ", firstName.text.toString())
            Log.d("Last Name: ", lastName.text.toString())
            Log.d("Date of Birth: ", dateOfBirth.text.toString())
            Log.d("Email: ", email.text.toString())
        })

    }
}