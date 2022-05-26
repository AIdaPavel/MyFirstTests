package pavel.ivanov.myfirsttests.presenter

import io.reactivex.Observable
import pavel.ivanov.myfirsttests.model.SearchResponse
import pavel.ivanov.myfirsttests.repository.RepositoryCallback

interface RepositoryContract {

    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )

    fun searchGithub(
        query: String
    ): Observable<SearchResponse>

    suspend fun searchGithubAsync(
        query: String
    ): SearchResponse
}