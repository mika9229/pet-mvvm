package test.com.petmvvm.core.api.comunicator


import android.util.Log
import test.com.petmvvm.core.api.request.TestRequest
import test.com.petmvvm.core.api.response.TestResponse
import test.com.petmvvm.core.api.services.RepoInstance
import test.com.petmvvm.core.api.services.TestService


class AuthCommunicatorImpl(val apiTestService: TestService) :
    AuthCommunicator {

    override suspend fun sendReqest(body: TestRequest): TestResponse {
        return apiTestService.getTestLogin(body)
    }

}

