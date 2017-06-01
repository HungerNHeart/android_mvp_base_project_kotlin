package com.droidmob.droid_kotlin.presenter.ipresenter

import android.os.Bundle

/**
 * Created by Guru karthik on 01-06-2017.
 */
interface IPresenter {
    fun onCreate(bundle: Bundle?)

    fun onStart()

    fun onStop()

    fun onResume()

    fun onPause()

    fun onDestroy()
}