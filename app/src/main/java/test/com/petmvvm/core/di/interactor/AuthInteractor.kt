package test.com.petmvvm.core.di.interactor

import test.com.petmvvm.core.api.request.TestRequest
import test.com.petmvvm.core.api.response.TestResponse


interface AuthInteractor {

    fun getTest():String

    suspend fun getUser(body: TestRequest): TestResponse
}

