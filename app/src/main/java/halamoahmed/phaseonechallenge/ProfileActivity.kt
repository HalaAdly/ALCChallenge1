package halamoahmed.phaseonechallenge

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profile.*


class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setTitle(R.string.my_profile)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        phone_txt.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            // Send phone number to intent as data
            intent.data = Uri.parse("tel:" + "00201004154332")
            // Start the dialer app activity with number
            startActivity(intent)
        }

        mail_txt.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse("mailto:halaadly@gmail.com?subject=" + "" + "&body=" + "")
            intent.data = data
            startActivity(intent)
        }
    }
}
