package com.droidmob.droid_kotlin.view.activity

import android.os.Bundle
import android.view.View
import com.droidmob.droid_kotlin.R
import com.droidmob.droid_kotlin.presenter.ipresenter.ILoginPresenter
import com.droidmob.droid_kotlin.presenter.LoginPresenter
import com.droidmob.droid_kotlin.view.iview.ILoginView
import kotlinx.android.synthetic.main.activity_login.*

//I
class LoginActivity : BaseActivity(), ILoginView,View.OnClickListener {

    //The keyword var defines the variable will be Mutable(changeable).
    var iLoginPresenter: ILoginPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        button_login.setOnClickListener(this)
        iLoginPresenter = LoginPresenter(this) as ILoginPresenter
        iLoginPresenter?.onCreate(intent.extras)
    }

    fun onClickLogin(){
        val phoneNumber = text_phone_number.text.toString()
        if (phoneNumber.length == 10)
            iLoginPresenter?.onClickLogin(phoneNumber)
        else showMessage("Please enter a proper phone number!")
    }

    override fun onClick(view: View?) {
        when(view?.id){
            button_login.id -> {
                onClickLogin()
            }
        }
    }
}
