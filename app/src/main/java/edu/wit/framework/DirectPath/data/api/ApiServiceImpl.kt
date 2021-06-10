package edu.wit.framework.DirectPath.data.api

import edu.wit.framework.DirectPath.data.model.User
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single

class ApiServiceImpl : ApiService {

    override fun getUsers(): Single<List<User>> {
        return Rx2AndroidNetworking.get("https://60c274c6917002001739d00c.mockapi.io/Users/")
            .build()
            .getObjectListSingle(User::class.java)
    }

}