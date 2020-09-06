package test.com.petmvvm.core.di.interactor

import android.annotation.SuppressLint
import android.util.Log
import kotlinx.coroutines.*
import test.com.petmvvm.core.api.comunicator.AuthCommunicator
import test.com.petmvvm.core.api.response.GithubResponse

@SuppressLint("CheckResult")
class AuthInteractorImpl(private val authCommunicator: AuthCommunicator): AuthInteractor {
    private val coroutineScope = CoroutineScope(Dispatchers.IO)

    override suspend fun authorize(mail: String, password: String): String {
       var reqest =  authCommunicator.sendReqest(mail, password)
        return reqest.id.toString()
    }

}
