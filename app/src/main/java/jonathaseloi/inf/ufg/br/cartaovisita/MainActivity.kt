package jonathaseloi.inf.ufg.br.cartaovisita

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import jp.wasabeef.glide.transformations.BlurTransformation
import com.bumptech.glide.request.RequestOptions.bitmapTransform
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions.centerCropTransform


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initImage();
    }

    fun initImage() {
        Glide.with(this).load(R.drawable.img_foto)
                .apply(centerCropTransform())
                .into(findViewById<View>(R.id.ivFoto) as ImageView)
    }
}
