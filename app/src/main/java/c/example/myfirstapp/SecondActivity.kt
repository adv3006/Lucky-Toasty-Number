package c.example.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    fun showRandomNumber() {
        // Get the count from the intent extras
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        // Generate the random number
        var randomInt = 0
        // Add one because the bound is exclusive
        if (count > 0) {
            // Add one because the bound is exclusive
            randomInt = (0..count+1).random()
        }
        // Display the random number.
        findViewById<TextView>(R.id.textview_labe2).text =
                Integer.toString(randomInt)
        // Substitute the max value into the string resource
        // for the heading, and update the heading
        findViewById<TextView>(R.id.textview_label).text =
                getString(R.string.random_heading, count)
    }
}
