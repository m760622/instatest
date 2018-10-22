package se.nmds.instatest.screen.splash

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import se.nmds.instatest.screen.authentication.AuthenticationActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AuthenticationActivity.start(this)
        finish()
    }
}
