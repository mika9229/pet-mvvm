package test.com.petmvvm.core.di.interactor

import android.annotation.SuppressLint
import android.util.Log
import test.com.petmvvm.core.api.comunicator.AuthCommunicator
import test.com.petmvvm.core.api.request.TestRequest
import test.com.petmvvm.core.api.response.TestResponse

@SuppressLint("CheckResult")
class AuthInteractorImpl(private val authCommunicator: AuthCommunicator): AuthInteractor {


    override fun getTest(): String {
        return "test"
    }


    override suspend fun getUser(body: TestRequest): TestResponse {
        return authCommunicator.sendReqest(body)
    }

}
