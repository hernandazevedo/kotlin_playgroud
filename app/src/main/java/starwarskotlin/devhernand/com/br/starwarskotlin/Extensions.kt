package starwarskotlin.devhernand.com.br.starwarskotlin

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.Toast;
/**
 * Created by Nando on 07/10/2017.
 */
class Extensions {

    fun Context.Toast(message: CharSequence,duration: Int = Toast.LENGTH_SHORT){
        Toast.makeText(this,message,duration).show()
    }

    val ViewGroup.childViews : List<View>
        get() = (0 until childCount).map { getChildAt(it) }
}