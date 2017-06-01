package com.droidmob.droid_kotlin.view.iview

import android.support.v4.app.FragmentActivity
import java.lang.Exception

/**
 * Created by Guru karthik on 01-06-2017.
 */
open interface IView{

    fun showMessage(message: String)

    fun showMessage(message: Exception)

    fun getActivity(): FragmentActivity
}