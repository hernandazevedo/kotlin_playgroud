package starwarskotlin.devhernand.com.br.starwarskotlin

import android.content.Context
import android.widget.Toast;
/**
 * Created by Nando on 07/10/2017.
 */
class Extensions {

    fun Context.Toast(message: CharSequence,duration: Int = Toast.LENGTH_SHORT){
        Toast.makeText(this,message,duration).show()
    }
}