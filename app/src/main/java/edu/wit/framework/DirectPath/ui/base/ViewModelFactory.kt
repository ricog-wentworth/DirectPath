package edu.wit.framework.DirectPath.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import edu.wit.framework.DirectPath.data.api.ApiHelper
import edu.wit.framework.DirectPath.data.repository.MainRepository
import edu.wit.framework.DirectPath.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}