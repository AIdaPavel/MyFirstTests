package pavel.ivanov.myfirsttests.repository

import io.reactivex.Observable
import pavel.ivanov.myfirsttests.model.SearchResponse
import pavel.ivanov.myfirsttests.model.SearchResult
import pavel.ivanov.myfirsttests.presenter.RepositoryContract
import retrofit2.Response
import kotlin.random.Random

internal class FakeGitHubRepository : RepositoryContract {

    override fun searchGithub(
        query: String,
        callback: RepositoryCallback
    ) {
        callback.handleGitHubResponse(Response.success(generateSearchResponse()))
    }

    override fun searchGithub(query: String): Observable<SearchResponse> {
        return Observable.just(generateSearchResponse())
    }

    override suspend fun searchGithubAsync(query: String): SearchResponse {
        return generateSearchResponse()
    }

    private fun generateSearchResponse(): SearchResponse {
        val list: MutableList<SearchResult> = mutableListOf()
        for (index in 1..100) {
            list.add(
                SearchResult(
                    id = index,
                    name = "Name: $index",
                    fullName = "FullName: $index",
                    private = Random.nextBoolean(),
                    description = "Description: $index",
                    updatedAt = "Updated: $index",
                    size = index,
                    stargazersCount = Random.nextInt(100),
                    language = "",
                    hasWiki = Random.nextBoolean(),
                    archived = Random.nextBoolean(),
                    score = index.toDouble()
                )
            )
        }
        return SearchResponse(list.size, list)
    }
}