package com.vtnd.lus.ui.auth

import com.vtnd.lus.base.BaseViewModel
import com.vtnd.lus.data.RepoRepository

class AuthViewModel(private val repoRepository: RepoRepository) : BaseViewModel() {
    val isOpenFirstApp = repoRepository.isOpenFirstApp()

    fun setOpenFirstApp() {
        repoRepository.setOpenFirstApp(false)
    }
}
