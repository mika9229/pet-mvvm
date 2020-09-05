package test.com.petmvvm.core.api.comunicator


import test.com.petmvvm.core.api.request.TestRequest
import test.com.petmvvm.core.api.response.TestResponse


interface AuthCommunicator {

    suspend fun sendReqest(body: TestRequest): TestResponse

}