package pl.mkonkel.wsb.firebasepush

import android.app.Application
import com.google.firebase.iid.FirebaseInstanceId

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        FirebaseInstanceId.getInstance().InstanceId
            .addO

// TODO: Add FirebaseInstanceId Callback here
//        It is goot to log or print the token somewhere - it will be needed later.
    }
}