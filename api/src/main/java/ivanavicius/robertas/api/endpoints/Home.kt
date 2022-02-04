package ivanavicius.robertas.api.endpoints

import android.content.Context
import com.google.gson.Gson
import ivanavicius.robertas.api.R
import ivanavicius.robertas.api.entities.Seasons
import java.nio.charset.Charset

object Home {
     fun getSeasons(context: Context): Seasons {
        val data = context.resources.openRawResource(R.raw.hbo_silicon_valley).let {
            String(it.readBytes(), Charset.forName("UTF-8"))
        }
        return Gson().fromJson(data, Seasons::class.java)
    }
}