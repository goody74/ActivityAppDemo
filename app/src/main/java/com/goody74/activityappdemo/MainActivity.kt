package com.goody74.activityappdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

// private const val TAG = "MainActivity"
private const val MY_OWN_LOG_TAG = "MyLog"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(MY_OWN_LOG_TAG, "Ты видел деву на скале")
        Log.d(MY_OWN_LOG_TAG, "В одежде белой над волнами")
    }

    override fun onStart() {
        super.onStart()

        Log.d(MY_OWN_LOG_TAG, "Когда, бушуя в бурной мгле,")
        Log.d(MY_OWN_LOG_TAG, "Играло море с берегами,")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_OWN_LOG_TAG, "Когда луч молний озарял")
        Log.d(MY_OWN_LOG_TAG, "Ее всечасно блеском алым")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_OWN_LOG_TAG, "И ветер бился и летал")
        Log.d(MY_OWN_LOG_TAG, "С ее летучим покрывалом?")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MY_OWN_LOG_TAG, "Прекрасно море в бурной мгле")
        Log.d(MY_OWN_LOG_TAG, "И небо в блесках без лазури;")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_OWN_LOG_TAG, "Но верь мне: дева на скале")
        Log.d(MY_OWN_LOG_TAG, "Прекрасней волн, небес и бури.")
    }
}

