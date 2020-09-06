package test.com.petmvvm.core.api.request

import com.google.gson.annotations.SerializedName

data class LoginReqestBody(@SerializedName("scopes") var scopes : List<String>,
                      @SerializedName("note") var note : String) {

     companion object{
         fun getMokData():LoginReqestBody{
             return LoginReqestBody(listOf("repo", "user"), "token_for_test_app")
         }
     }
}

