package test.com.petmvvm.core.api.response

import com.google.gson.annotations.SerializedName

data class GithubResponse(
    @SerializedName("id") var id : Long,
    @SerializedName("token") var token : String,
    @SerializedName("hashed_token") var hashed_token : String)
