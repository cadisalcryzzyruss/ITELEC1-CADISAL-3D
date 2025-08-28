import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "ActivityLifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: Activity is created")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: Activity is visible to the user")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: Activity is in the foreground and interactive")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: Activity is partially hidden, save data here")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: Activity is completely hidden")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: Activity is being destroyed")
    }
}
