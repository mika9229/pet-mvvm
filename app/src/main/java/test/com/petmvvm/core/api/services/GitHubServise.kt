package test.com.petmvvm.core.api.services

import kotlinx.coroutines.Deferred
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import test.com.petmvvm.core.api.request.LoginReqestBody
import test.com.petmvvm.core.api.response.GithubResponse


interface GitHubServise {

    @POST("authorizations")
    suspend fun getTestLogin(@Body body: LoginReqestBody, @Header("Authorization") header: String ): GithubResponse


}