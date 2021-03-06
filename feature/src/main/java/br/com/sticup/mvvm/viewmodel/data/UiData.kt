package br.com.sticup.mvvm.viewmodel.data

import br.com.sticup.mvvm.repository.data.User

data class UsersList(val users: List<User>, val message: String, val error: Throwable? = null)
