package pavel.ivanov.myfirsttests.presenter

import pavel.ivanov.myfirsttests.repository.RepositoryCallback

internal interface RepositoryContract {
    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )
}
