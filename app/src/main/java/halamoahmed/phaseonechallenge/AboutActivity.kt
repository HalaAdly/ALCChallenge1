package halamoahmed.phaseonechallenge

import android.content.DialogInterface
import android.net.http.SslError
import android.os.Bundle
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about.*


class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setTitle(R.string.about)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        webview.settings.javaScriptEnabled = true
        webview.zoomOut()
        webview.webViewClient = object : WebViewClient() {
            override fun onReceivedSslError(v: WebView, handler: SslErrorHandler, er: SslError) {
                // for SSLErrorHandler
                val builder = AlertDialog.Builder(this@AboutActivity)
                builder.setMessage("SSL certificate is invalid\nPlease click continue to display page")
                builder.setPositiveButton("continue",
                    DialogInterface.OnClickListener { dialog, which -> handler.proceed() })
                builder.setNegativeButton("cancel",
                    DialogInterface.OnClickListener { dialog, which -> handler.cancel() })
                val dialog = builder.create()
                dialog.show()
            }
        }

        webview.loadUrl("https://andela.com/alc/")
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
