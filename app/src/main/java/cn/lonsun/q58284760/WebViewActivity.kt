package cn.lonsun.q58284760

import android.os.Bundle
import android.util.Base64
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {
    private val contentText = "<!DOCTYPE html><html><body> <p> c&#39;est la vie</p> </body></html>"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        val encodedHtml = Base64.encodeToString(contentText.toByteArray(), Base64.NO_PADDING)
        mWebView.loadData(encodedHtml, "text/html", "base64")

    }
}
