package edu.wit.framework.DirectPath.data.repository

import edu.wit.framework.DirectPath.data.api.ApiHelper
import edu.wit.framework.DirectPath.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}