package test.com.petmvvm.core.api.request

import com.google.gson.annotations.SerializedName
import test.com.demostart.core.api.request.NameRequest

class TestRequest {

    @SerializedName("type")
    var type: String?  = null
    @SerializedName("properties")
    var properties: Properties?  = null

    class Properties {
        @SerializedName("Properties")
        var items: NameRequest?  = null

    }

}