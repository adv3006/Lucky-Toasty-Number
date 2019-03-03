package c.example.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun toastMe(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast",
                Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun countMe(view: View) {
        // Get the text view
        val showCountTextView = findViewById<TextView>(R.id.textView)

        // Get the value of the text view.
        val countString = showCountTextView.text.toString()

        // Convert value to a number and increment it
        var count = Integer.parseInt(countString)
        count++

        // Convert back
        showCountTextView.text = count.toString()
    }

    fun randomMe(view: View) {
//        // Grab text view
//        val showRandomTextView = findViewById<TextView>(R.id.textView)
//
//        // Grab its value
//        val randomString = showRandomTextView.text.toString()
//
//        // Convert value to an integer to randomize
//        var random = Integer.parseInt(randomString)
//        random = (0..10).random()
//
//        // Convert back
//        showRandomTextView.text = random.toString()

        // Create an Intent to start the second activity
        val randomIntent = Intent(this, SecondActivity::class.java)
        // Grab the value of the text view
        val countString = textView.text.toString()
        // Convert value to integer to randomize
        val count = Integer.parseInt(countString)
        // Add count to the extra for the Intent
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        // Start the new activity.
        startActivity(randomIntent)
    }

}
