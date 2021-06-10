package edu.wit.framework.DirectPath.data.api

import edu.wit.framework.DirectPath.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}