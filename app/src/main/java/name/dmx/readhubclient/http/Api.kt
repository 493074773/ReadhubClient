package name.dmx.readhubclient.http

import io.reactivex.Observable
import name.dmx.readhubclient.model.Topic
import retrofit2.http.*

/**
 * Created by dmx on 17-10-30.
 */
interface Api {
    @GET("topic")
    fun getTopics(@Query("lastCursor") lastCursor: Long?, @Query("pageSize") pageSize: Int): Observable<PageResult<Topic>>

}