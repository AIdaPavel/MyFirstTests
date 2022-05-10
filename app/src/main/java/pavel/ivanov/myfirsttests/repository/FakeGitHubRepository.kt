package pavel.ivanov.myfirsttests.repository

import pavel.ivanov.myfirsttests.model.SearchResponse
import pavel.ivanov.myfirsttests.presenter.RepositoryContract
import retrofit2.Response

internal class FakeGitHubRepository : RepositoryContract {

    override fun searchGithub(
        query: String,
        callback: RepositoryCallback
    ) {
        callback.handleGitHubResponse(Response.success(SearchResponse(42, listOf())))
    }
}