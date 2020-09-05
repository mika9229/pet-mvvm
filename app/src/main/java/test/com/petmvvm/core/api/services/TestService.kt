package test.com.petmvvm.core.api.services

import retrofit2.http.Body
import retrofit2.http.POST
import test.com.petmvvm.core.api.request.TestRequest
import test.com.petmvvm.core.api.response.TestResponse


interface TestService {

    // TODO  @Query("n") count: Int - test only
        @POST("?n=1")
    suspend fun getTestLogin(@Body body: TestRequest): TestResponse


}