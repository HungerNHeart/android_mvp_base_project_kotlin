package com.droidmob.droid_kotlin.view.activity

import android.support.v4.app.FragmentActivity
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.droidmob.droid_kotlin.view.iview.IView
import java.lang.Exception

/**
 * Created by Guru karthik on 01-06-2017.
 */
open abstract class BaseActivity : AppCompatActivity(), IView {

    protected val TAG: String = javaClass.simpleName

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun showMessage(message: Exception) {
        Toast.makeText(this, message.message, Toast.LENGTH_LONG).show()
    }

    override fun getActivity(): FragmentActivity {
        return this
    }
}