package com.droidmob.droid_kotlin.presenter

import android.os.Bundle
import com.droidmob.droid_kotlin.presenter.ipresenter.ILoginPresenter
import com.droidmob.droid_kotlin.view.iview.ILoginView

/**
 * Created by Guru karthik on 01-06-2017.
 */
open class LoginPresenter(val iLoginView: ILoginView): Presenter(), ILoginPresenter {

    override fun onCreate(bundle: Bundle?) {

    }

    override fun onClickLogin(phoneNumber: String) {
        iLoginView.showMessage("We are trying to log-in with $phoneNumber")
    }

}