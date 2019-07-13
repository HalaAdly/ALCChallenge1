package halamoahmed.phaseonechallenge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle(R.string.alc_phase_one)
        about_btn.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
        profile_btn.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}
